package com.yonyou.cloud.demo.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Duration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Slf4j
@EnableCaching
@Configuration
public class RedisConfig extends CachingConfigurerSupport {

  @Value("${redis.cache.expire.time}")
  private int CacheExpireTime;
  /**
   * 过期时间10分钟
   */
  private Duration timeToLive = Duration.ofMinutes(CacheExpireTime);

  @Bean
  @ConditionalOnMissingBean(name = "redisTemplate")
  public RedisTemplate<String, Object> redisTemplate(
      RedisConnectionFactory redisConnectionFactory) {
    Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(
        Object.class);
    ObjectMapper om = new ObjectMapper();
    om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
    om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
    jackson2JsonRedisSerializer.setObjectMapper(om);
    RedisTemplate<String, Object> template = new RedisTemplate<>();
    template.setConnectionFactory(redisConnectionFactory);
    template.setKeySerializer(jackson2JsonRedisSerializer);
    template.setValueSerializer(jackson2JsonRedisSerializer);
    template.setHashKeySerializer(jackson2JsonRedisSerializer);
    template.setHashValueSerializer(jackson2JsonRedisSerializer);
    template.afterPropertiesSet();
    return template;
  }

  @Bean
  public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {
    RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
        .entryTtl(this.timeToLive)
        .serializeKeysWith(
            RedisSerializationContext.SerializationPair.fromSerializer(keySerializer()))
        .serializeValuesWith(
            RedisSerializationContext.SerializationPair.fromSerializer(valueSerializer()))
        .disableCachingNullValues();
    RedisCacheManager redisCacheManager = RedisCacheManager.builder(connectionFactory)
        .cacheDefaults(config)
        .transactionAware()
        .build();
    log.debug("自定义RedisCacheManager加载完成");
    return redisCacheManager;
  }

  private RedisSerializer<String> keySerializer() {
    return new StringRedisSerializer();
  }

  private RedisSerializer<Object> valueSerializer() {
    return new GenericJackson2JsonRedisSerializer();
  }

}

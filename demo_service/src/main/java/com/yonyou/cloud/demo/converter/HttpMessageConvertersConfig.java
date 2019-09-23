package com.yonyou.cloud.demo.converter;

import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

@Configuration
public class HttpMessageConvertersConfig {

  @Bean
  public HttpMessageConverters fastJsonHttpMessageConverters() {
    // 定义一个converter转换消息的对象
    FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
    // 添加fastjson配置信息
    FastJsonConfig fastJsonConfig = new FastJsonConfig();
    fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat,
        SerializerFeature.WriteBigDecimalAsPlain);
    //BigDecimal数据处理
    SerializeConfig serializeConfig = SerializeConfig.getGlobalInstance();
    serializeConfig.put(BigDecimal.class, CustomerBigDecimalCodec.INSTANCE);
    fastJsonConfig.setSerializeConfig(serializeConfig);
    //3.在convert中添加配置信息
    fastConverter.setFastJsonConfig(fastJsonConfig);
    //4.中文乱码
    List<MediaType> fastMediaTypes = new ArrayList<>();
    fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
    fastConverter.setSupportedMediaTypes(fastMediaTypes);

    return new HttpMessageConverters(fastConverter);
  }
}

FROM java:8

MAINTAINER zhangwbin

ADD ./target/eureka-0.0.1-SNAPSHOT.jar /usr/local/
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/local/eureka-0.0.1-SNAPSHOT.jar"]

EXPOSE 8761
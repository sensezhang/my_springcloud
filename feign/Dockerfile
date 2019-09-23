FROM java:8

MAINTAINER zhangwbin

ADD ./target/feign-0.0.1-SNAPSHOT.jar /usr/local/
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/local/feign-0.0.1-SNAPSHOT.jar"]

EXPOSE 9000
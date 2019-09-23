FROM java:8

MAINTAINER zhangwbin

ADD ./target/demoClient-0.0.1-SNAPSHOT.jar /usr/local/
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/local/demoClient-0.0.1-SNAPSHOT.jar"]

EXPOSE 9101
FROM java:8

MAINTAINER zhangwbin

ADD ./target/demo_client-0.0.1-SNAPSHOT.jar /usr/local/
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/local/demo_client-0.0.1-SNAPSHOT.jar"]

EXPOSE 9101
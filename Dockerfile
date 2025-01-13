FROM amazoncorretto:21-alpine3.19-jdk

ADD target/CustomFinaleNicName.jar customfinalenicname.jar

ENTRYPOINT ["java", "-jar", "/customfinalenicname.jar"]
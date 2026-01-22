#FROM openjdk:27-ea-oraclelinux8
FROM public.ecr.aws/docker/library/openjdk:27-ea-oraclelinux8 
ADD target/docker-0.0.1-SNAPSHOT.jar docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-0.0.1-SNAPSHOT.jar"]   
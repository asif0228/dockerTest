FROM eclipse-temurin:22
RUN mkdir /opt/app
COPY dockerTest.jar /opt/app
CMD ["sh", "-c", "java -jar /opt/app/dockerTest.jar"]

# EXPOSE 80
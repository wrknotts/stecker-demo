FROM java:7
VOLUME /tmp
COPY stecker-demo-0.0.1.jar /app/app.jar
RUN unzip /app/app.jar -d /app && rm /app/app.jar
COPY selfsigned-keystore.jks /app/selfsigned-keystore.jks
ENTRYPOINT ["java","-cp","/app/","org.springframework.boot.loader.JarLauncher"]
FROM eclipse-temurin:21-jdk

WORKDIR /app

RUN apt-get update && apt-get install -y curl

COPY target/testng-fat-jar.jar app.jar
COPY src/test/resources/testng.xml testng.xml
# 加入启动前的等待脚本
COPY wait-for-selenium.sh wait-for-selenium.sh
RUN chmod +x wait-for-selenium.sh

CMD sh -c './wait-for-selenium.sh'

#CMD ["sh", "wait-for-selenium.sh"]
#CMD ["java", "-cp", "app.jar", "org.testng.TestNG", "testng.xml"]
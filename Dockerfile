FROM eclipse-temurin:17
COPY target/operator.jar myoperator.jar
CMD ["java","-jar","myoperator.jar"]
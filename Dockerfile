FROM openjdk:8
EXPOSE 8080
ADD target/todo-List-Backend.jar todo-List-Backend.jar
ENTRYPOINT ["java", "-jar", "/todo-List-Backend.jar"]
# Use a imagem com JDK e Maven para compilar a aplicacao
FROM maven:3.8.1-openjdk-17-slim AS build

# Define o WORKDIR no container
WORKDIR /app

# Copia o arquivo pom.xml para o WORKDIR
COPY pom.xml .

# Copia o código-fonte para o WORKDIR
COPY src ./src

# Compila o aplicativo com o Maven
RUN mvn clean package

# Crie uma imagem baseada na JDK para executar a aplicacao
FROM openjdk:17

# Define o WORKDIR no container
WORKDIR /app

# Copia o JAR da aplicacao para o WORKDIR
COPY --from=build /app/target/*.jar ./app.jar

# Executa a aplicacao
CMD ["java", "-jar", "app.jar"]

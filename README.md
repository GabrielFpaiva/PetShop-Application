# Petshop
## Descrição
Este projeto é um sistema de Petshop desenvolvido em Java utilizando o framework Spring Boot. O objetivo do sistema é fornecer funcionalidades para gerenciamento de um petshop, como cadastro de clientes, agendamento de consultas e registro de animais.

## Dependências
Para executar o projeto, é necessário ter as seguintes dependências instaladas:

- Docker

## Configuração do Banco de Dados
Para criar o banco de dados necessário para o funcionamento do sistema, execute o seguinte comando no terminal:

```shell
$ docker run --name petshop -e MYSQL_ROOT_PASSWORD=123 -e MYSQL_DATABASE=petshop -e MYSQL_USER=exemplo -e MYSQL_PASSWORD=123 -p 3306:3306 -d mysql:latest
```
## Dependências Externas
As seguintes dependências externas são utilizadas neste projeto:

- [Spring Boot Starter JDBC](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-jdbc)
- [Spring Boot Starter Validation](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation)
- [Spring Boot Starter Data JPA](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
- [Spring Boot Starter Data REST](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-rest)
- [Spring Boot Starter Web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
- [MySQL Connector/J](https://mvnrepository.com/artifact/mysql/mysql-connector-java)
- [FlatLaf](https://mvnrepository.com/artifact/com.formdev/flatlaf)
- [Jackson Annotations](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations)

## Autores
- Anderson Vilela
- Bruna Gabriela
- Gabriel Fernandes
- Lucas Nóbrega
- Matheus Pessoa
- Pablo Marques

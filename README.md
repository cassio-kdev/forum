# Projeto Forum

###### Material estudado na plataforma Alura

#### Curso de Java API spring-boot-api-rest
###### Crie aplicações Java com o Spring Boot
###### Configura sua aplicação Spring sem o uso de arquivos XML.
###### Acelere seu desenvolvimento web com ajuda do Spring Devtools
###### Aprenda o estilo arquitetural REST
###### Use o Spring Data e Bean Validation

#### Curso de Java API spring-boot-seguranca-cache-monitoramento
###### Pagine e ordene os resultados da API
###### Melhore desempenho com Spring Cache
###### Protege a API com Spring Security e JWT
###### Monitore os endpoints com Spring Boot Actuator e Admin
###### Documente a API com Swagger https://dev09-forum.herokuapp.com/swagger-ui.html


##### Executar o projeto via Docker
###### Na raiz do projeto para criar a imagem da aplicação execute: docker build -t forum .
###### Para subir a aplicação execute: docker run -p 8080:8080 -e SPRING_PROFILES_ACTIVE='prod' -e FORUM_DATABASE_URL='jdbc:h2:mem:alura-forum' -e FORUM_DATABASE_USERNAME='sa' -e FORUM_DATABASE_PASSWORD='' -e FORUM_JWT_SECRET='123456' forum

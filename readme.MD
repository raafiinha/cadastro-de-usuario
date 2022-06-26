# Cadastro de Usuario ( DEV RAFAEL AUGUSTO )

##### CADASTRO DE USUÁRIOS API Restful

é uma aplicação back-end que contém API Restful. 
As requisições trabalham com JSON (entrada e saída).

- FrameWorks utilizados:

- Java 8, 
Maven,
Hibernate, 
HSQLDB

- JUnit, 
Fixture 
Factory, 
MockMvc

- Spring Boot, 
Spring Security, 

- Spring Data Rest, 
Spring hateoas
JWT
Continuous Integration - Heroku integrado com o GitHub

 A aplicação roda no Heroku em: https://cadastro-api.herokuapp.com

Para a aplicação executar, execute o clone do mesmo no seguinte comando:

##### - {mvn clean package spring-boot:run}

##### INFORMAÇÕES & REGISTRO

Ao iniciar, é possível realizar um cadastro aleatório;

Ex:

URL: /v1/usuarios

#### Utilizar o método: POST


#### ↓ Body ↓

```json Linguist
{
   "nome":"rafael",
   
   "email":"rafael@email.com",
   
   "senha":"password",
   
   "telefones":[
   
      {
         "celular":"99999999",
         "ddd":"12"
      },
      {
         "comercial":"9999999",
         "ddd":"12"
      }
   ]
}

```

 retornará um JSON com o usuário e o token que dará acesso ao sistema.

#### OBS: ( O Token é válido somente por 30 minutos ).

![1-cadastro](https://user-images.githubusercontent.com/107967231/175744995-28ac3994-5533-4e06-941a-f81dbc79251b.jpg)


#### Consultar Usuários


Com o token, é possível fazer a consulta do usuário através da seguinte URL:


URL: /v1/usuarios

#### Utilizar método: GET


 No header fazer a alteração, será necessário informar o key:[Authorization No value] é necessário

informar [Bearer] {token} em seguida retornará os dados atualizados do usuário.

![2-cadastro](https://user-images.githubusercontent.com/107967231/175750222-4d23b006-7ff7-4bf2-ab5e-1feefdd6e815.jpg)

#### Login sem TOKEN

Também há a possibilidade de usar o metódo sem "TOKEN"  através do seguinta link e realizar o login;

Ex:

URL: /auth

#### utilizar método: POST

 
#### Body:

```json
{
   "email":"rafael@email.com",
   "senha":"password",
}

```

a resposta de retorno é um JSON com o usuário e o token que dará acesso ao sistema.


![cadastro 3](https://user-images.githubusercontent.com/107967231/175752378-e42ec3d6-c7ba-44cf-b47f-64782ed7fb48.jpg)


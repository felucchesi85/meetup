# Meetups

# Java API Backend Service #

## Description ##

Distribucion de la App Meetups Service

## App Weather ##

Quieren armar las mejores meetups y para eso se necesita una App que nos ayude a lograr que no falte lo
fundamental Birras.

### Repository Files ###

Proyecto publico alojado en este github :
[GitHub page](https://github.com/felucchesi85/ChallengeMeetups).

## Git ##

Se utilizo git de versionador de codigo.

# Meetup Challenge -

+ Java
+ Spring boot.
+ Spring Security 5 JWT
+ JUNIT 5
+ Postman
+ Database: H2 Una vez que este levantada la App se puede ver la base de datos local en url:
  http://localhost:8181/h2-console
  username: admin password: admin

## Service startup Installation ##

+ mvn spring-boot:run

+Desde Intellij Idea:
Clonar el proyecto desde github https://github.com/felucchesi85/ChallengeMeetups
Descargar el codigo o clonar de git IDE: File/Open : Repo una vez que el ide reconocio el proyecto maven. Buscar la
clase AppMeetupsApplication y darle Run.

+Desde Spring Tool :
Clonar el proyecto en un repo local IDE : File/Open Projects from file System/Directory :buscar el repo que reconzca el
IDE el poryecto como un Eclipse Projects/Finish En caso de ser necesario Sobre el proyecto Maven Update Projects para
actualizar dependencias En el application properties se puede modificar el puerto si es necesario Sobre el proyecto /Run
As /Spring Boot App: para correr el proyecto spring boot

## Usage ##

Method    | Path    | Description    | User authenticated    | Available from UI
------------- | ------------------------- | ------------- |:-------------:|:----------------:|
POST| /meetups/    | Register new meetup    | x |
GET    | /weathers/{meetUpId}    | Get weather on meetup    | × |
GET    | /beers/{meetUpId}    | Get beers on meetup number  | x  |
POST| /user/    | Register user/token to validation data    | × |

POST /meetups/ Body:
json:

        {
        "address":"Lavalleja 3232 Alta Cordoba",
        "date":"2021-04-19"
        }

POST /user Body:
x www-form-urlencoded
"key":              "value":  
user:              admin password:          pwd

Key    | Value    |
------------- | ------------------------- |
user| admin    |
password| pwd    |

return:

        {
        "user": "admin",
        "pwd": null,
        "token": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJBcHAtTWVldHVwcyBTYW50YW5kZXJKV1QiLCJzdWIiOiJhZG1pbiIsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJpYXQiOjE2MTg5Mzk1MTUsImV4cCI6MTYxODk0MDExNX0.H2QH8TrUUa2gofRDfWeY3n8rmMW2yuYNjDhL1nvMlM3-V0-Mu1tHatQR3fsATp6fuUmDf2sKkCMC1CwSkN755Q"
        }

Copiar el Bearer para usar en autenticacion.

## Spring Security ##

Token basado en la API authentication con Spring y JWT. Esta aplicacion implementar un controlador para autenticar
usuarios y generar un token de acceso. ¿Cómo funciona?

El cliente se autentica y garantiza su identidad haciendo una petición al servidor de autenticación. Esta petición puede
ser mediante usuario contraseña, mediante proveedores externos (Google, Facebook, etc) o mediante otros servicios como
LDAP, Active Directory, etc. Una vez que el servidor de autenticación garantiza la identidad del cliente, se genera un
token de acceso (JWT). El cliente usa ese token para acceder a los recursos protegidos que se publican mediante API. En
cada petición, el servidor desencripta el token y comprueba si el cliente tiene permisos para acceder al recurso
haciendo una petición al servidor de autorización.

Pasos:

1)Arrancamos nuestra api dando Run a nuestra AppMeetupsApplication

2)Desde Postman, hacemos una petición POST a http://localhost:8181/meetups y comprobamos que nos da un 403, pues el
recurso está protegido:

3)Desde Postman, hacemos una petición POST a /user para autenticarnos, incluyendo usuario y contraseña, y obtenemos un
token de acceso:

3.1)POST: localhost:8181/user BODY: x-www-form-urlencoded: agregamos 2 keys una para el user:elegimos un nombre de
usuario y otra para la password: elegimos una password

3.2)el return debe dar un status 200 OK Y en el BODY de la respuesta nos va a aparecer algo asi .

    {
    "user": "admin",
    "pwd": null,
    "token": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJzYW50YW5kZXJUZWNub2xvZ2lhSldUIiwic3ViIjoiYWRtaW4iLCJhdXRob3JpdGllcyI6WyJST0xFX1VTRVIiXSwiaWF0IjoxNjE4NjgwODY5LCJleHAiOjE2MTg2ODE0Njl9.-nbNMRAFIgK-gTPpoucr0ocMm72SIKDTAWbgN8Y5bC_O2_dgyX28ON-O8tFp3RHnQ7wZIp1aKPAmEONqRtx6FA"
    }

3.3)Copy todo lo que esta dentro de las comillas dobles Bearer incluido

4) Y Volvemos a hacer la petición GET del paso que anteriormente incluyendo una cabecera Authorization con el token
   generado en el punto  
   EL 403 cambia a 200 y con respuesta

## Internationalization and Locale (I18n) ##

Estructura armada

## Junit 5 ##

## Service URL

+ http://localhost:8181/

## Swagger URL

+ http://localhost:8181/swagger-ui.html

heroku 
cambios


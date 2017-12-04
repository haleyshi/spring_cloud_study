# spring_cloud_study

  C:\Windows\System32\drivers\etc\hosts, /etc/hosts
  
  127.0.0.1 discovery peer1 peer2 config-server gateway movie user feign ribbon
  

## Eureka HA
http://discovery:8761
 
 
## Eureka HA
java -jar microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2

http://peer1:8761
http://peer2:8762

## Provider User
http://localhost:8000/1
http://localhost:8000/2

## Provider HA on 1 host
java -jar microservice-provider-user-0.0.1-SNAPSHOT-p8000.jar 
java -jar microservice-provider-user-0.0.1-SNAPSHOT-p8001.jar

http://localhost:8010/ribbon/3


## Hystrix
http://localhost:8011/ribbon/3
http://localhost:8021/feign/3

% shutdown provider-user application
http://localhost:8011/ribbon/3
http://localhost:8021/feign/3

http://localhost:8011/hystrix.stream
http://localhost:8021/hystrix.stream

## Turbine
http://localhost:8011/ribbon/3
http://localhost:8021/feign/3

http://localhost:8031/turbine.stream

## Hystrix Dashboard
http://localhost:8030/hystrix.stream
### src
http://localhost:8011/hystrix.stream
http://localhost:8021/hystrix.stream
http://localhost:8031/turbine.stream

## Config Server
http://localhost:8040/microservice-config-client-dev.properties
http://localhost:8040/microservice-config-client/dev

## Config Client
http://localhost:8041/hello
curl  -X POST http://localhost:8041/refresh
http://localhost:8041/hello

## Config Server with Eureka
http://localhost:8040/microservice-config-client-eureka-dev.properties
http://localhost:8040/microservice-config-client-eureka/dev

## Config Client with Eureka
http://localhost:8051/hello
curl  -X POST http://localhost:8051/refresh
http://localhost:8051/hello

## Zuul Api Gateway
### Default routing
http://localhost:8060/microservice-provider-user/1
http://GATEWAY:GATEWAY_PORT/想要访问的Eureka服务id的小写/<uri> >> http://想要访问的Eureka服务id的小写:该服务端口/<uri>

### Self defined routing
http://localhost:8060/user/1

### Hide some API from public
http://localhost:8050/microservice-provider-user/1  >>> Get 404
http://localhost:8060/movie/ribbon/1




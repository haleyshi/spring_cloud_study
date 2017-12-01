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


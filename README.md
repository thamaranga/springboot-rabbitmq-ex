# springboot-rabbitmq-ex
This is  a sample application which demonstrates the usage of rabbitmq with spring boot

With a message queue we can handle message traffic simply and reliably.
docker container run -d --name my-rabbit -p 15672:15672 -p 5672:5672  rabbitmq:3-management --> Running a rabbitmq docker container
rabbitmq  docker container default  uname/password is guest.
rabbitmq  docker container admin interface can be accessed through http://localhost:15672/

Producer code is containted inside spring-rabbitmq-producer  folder.
Consumer code is containted inside spring-rabbitmq-consumer folder.

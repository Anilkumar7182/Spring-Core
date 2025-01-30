
# Spring Core Framework




### What is Spring Framework?

=> It is a Java Based framework.

=> It is free and open source.

=> Loosely coupled

=> It is developed modular fashion

=> Spring first version released in 2004 (1.x)

=> The current version of spring is 6.x

=> Spring framework under license of VMWare

=> Below Modules in spring framework

#

### Core Container
***Spring Core*** :=>	Provides IoC (Inversion of Control) and Dependency Injection (DI).

***Spring Beans*** :=>	Manages Spring Beans and their lifecycle.

***Spring Context*** :=>	Provides ApplicationContext, an advanced IoC container.

***Spring Expression Language (SpEL)*** :=>	Allows querying and manipulating objects at runtime.


### Data Access Layer

***Spring JDBC*** :=>	Simplifies working with JDBC by reducing boilerplate code.

***Spring ORM*** :=>	Provides integration with Hibernate, JPA, JDO, iBatis.

***Spring Transactions*** :=>	Manages declarative transactions with @Transactional.


### Web Layer

***Spring Web*** :=>	Provides core features for web applications (dispatcher, controllers).

***Spring Web MVC*** :=>	Supports MVC architecture for building web applications.

***Spring WebFlux*** :=>	Used for reactive programming, an alternative to Spring MVC.

***Spring REST*** =>	Simplifies building RESTful APIs using @RestController.


### Aspect-Oriented Programming (AOP)

***Spring AOP*** :=>	Enables cross-cutting concerns like logging, security, and transactions.

***Spring Aspects*** :=>	Provides integration with AspectJ for advanced AOP features.

### Security

***Spring Security*** :=>	Provides authentication and authorization for applications.

***Spring OAuth2*** :=>	Supports OAuth2-based authentication (JWT, OAuth2 Server).


### Integration & Messaging

***Spring JMS*** :=>	Supports Java Messaging Service (JMS) for messaging queues.

***Spring AMQP*** :=>	Supports RabbitMQ for message-based communication.

***Spring WebSockets*** :=>	Enables real-time communication using WebSockets.

***Spring Integration*** :=>	Provides enterprise integration patterns (EIP).

***Spring Batch*** :=>	Supports batch processing (used in ETL, reports).

***Spring Cloud*** :=>	Supports microservices development (Netflix Eureka, Zuul, etc.).


### Test Module

***Spring Test*** :=>	Provides testing support for Spring applications using JUnit and Mockito.

#

## Spring Framework Modules

1) Spring Core
2) Spring Context
3) Spring DAO
4) Spring ORM
5) Spring AOP
6) Spring Web MVC
7) Spring REST
8) Spring Security
9) Spring Cloud
10) Spring Batch
11) Spring Schedular...


#

### Spring Core


=> Base module of spring framework

=> Providing fundamentals of spring

		1) IOC Container
		2) Dependency Injection
		3) Auto wiring
        4) Bean 


### Spring Context


-> Provide support for configurations required for application


### Spring DAO


=> DAO stands for Data Access Object

=> It is used to communicate with database

=> Spring DAO module providing predefined classes to simplify dao layer development.


java app ----> spring dao ----> jdbc ---> database

		Ex : jdbcTemplate.execute(sql);


### Spring ORM


=> ORM stands for Object Relational Mapping

=> ORM is used to perform DB operations using objects.

		hibernate.save(empObj);

 java app ---> data jpa ---> orm -> hibernate --> jdbc -> db		

Note: Spring DAO & Spring ORM modules are used for database connectivity only

Spring DAO => represents data in text format

Spring ORM => represents data in objects format


### Spring Web MVC


=> MVC means Model , View & Controller

=> This module is used to develop web applications

		Customer ----> application (C2B)

=> It supports for JSP and Thymeleaf as presentation technologies.

Note: JSP and Thymeleaf are outdated.


### Spring REST


=> It is used to develop REST APIs (webservices)

=> REST API means distributed application.

=> If one application is communicating with another application then it is called as Distributed application.

	Ex: passport ----> aadhar

		gpay ---> bank app


### Spring Security


=> It is used to implement security in our application

=> It provides below functionalities

		1) Authentication ( who can login ? )
		2) Authorization ( what they can access ?)


### Spring Cloud


=> It provides resources to develop microservices based applications

Ex: Discovery server, api gateway, circuit breaker, config server....


### Spring Batch


-> It is used to implement batch processing (bulk operation)

usecases:

    1) Bank account stmt generation
    2) Credit card bill generation
    3) postpaid mobile bill generation


### Spring AOP


=> AOP stands for Aspect oriented programming

=> It is used to seperate cross cutting logics from business logic.

cross cutting logics : security, tx, auditing, logging ...


### Spring Schedular

=> It is used to schedule task execution.


###
# Spring Core module

=> Base module of Spring Framework

=> Providing fundamentals of spring framework

		1) IOC
		2) DI
		3) Auowiring

=> Spring Core module is used to manage our classes in the project.		


=> In a project we will have several classes

		1) controller classes (req & resp)
		2) service classes (business logic)
		3) Dao classes (db communication)		

=> in project execution process, One java class should call another java class method

=> In 2 ways one java class can call another java class method

		1) Inheritance (IS-A)

		2) Composition (HAS-A)	


### IS-A Relation	

- Extend the properties from one class to another class

- sub class can access super class method directley

		Engine - super class
		Car - sub class

***Note***: Car class can acces engine class method	

 - In the above approach car is extending properties from Engine class.

- In future car can't extend props from other classes bcz java doesn't support multiple inheritence.

- To overcome problem of IS-A relation we can use HAS-A relation.


### HAS-A relation


- Create object and call the method

- Inside car class create object for Engine class and call eng class method.

- If someone modify Engine class constructor then Car class will fail...

- with IS-A and HAS-A relation our classes are becoming tightly coupled.

- To overcome problems of IS-A and HAS-A relation we can use Spring Core module concepts.

		1) IOC Container
		2) Dependency Injection.

### *IOC Container (Inversion of control)*

- IOC is a principle which is used to manage & colloborate the classes available in our application.

- IOC will perform Dependency Injection in our application.

- By using IOC and DI we can achieve Loosely coupling among the classes.

- We will give our java classes and configuration as input to IOC container.

Note: We can do configuration in 3 ways

		1) xml (outdated -> springboot will not support)

		2) java based

		3) Anntoations

- IOC will take our normal java classes and it provides Spring Beans.

****Spring Bean**** : The java class which is managed by IOC is called as Spring bean.


### *depedency injection*
 - creating one cls obj and inject into another clas obj is called as dependency injection.



- we can perfodependency injection 2 type

      1) constructor injection 

      2) setter injection 

- ***constructor injection*** :=> inject dependent bean obj into target bean obj using target class setter method.

- ***setter injection***  :=> Inject dependent bean obj into target bean obj using target class parameterized constructor.

- If perform both CI and SI then  SI will override CI value
When a microservice instance contacts Eureka server wishing to register itself, Eureka server combines the application's IP address with the port number on which it's listening to create a unique identifier/locator for that microservice instance.

When making a REST call to another service, instead of providing a hostname and port, provide the service name. The actual routing is done at runtime along with equally distributing the load among the end services.

There are other service discovery clients like Consul, Zookeeper etc, but Eureka will be using in this project.

As an alternative, we could use the @EnableDiscoveryClient annotation, which comes from spring-cloud-commons.
It picks the implementation (Consul, Zookeeper, Eureka) according to the classpath. In this case, it would automatically choose Eureka.

We have the Eureka Discovery client jar in this project. Upon seeing this in the classpath, Spring will attempt to find a running Spring Eureka server. We need to specify this in the application.yml

There are multiple implementations of "Discovery Service" (eureka, consul, zookeeper). 
@EnableDiscoveryClient lives in spring-cloud-commons and picks the implementation on the classpath. 
@EnableEurekaClient lives in spring-cloud-netflix and only works for Eureka. 
If eureka is on your classpath, they are effectively the same.

# mvn spring-boot:run
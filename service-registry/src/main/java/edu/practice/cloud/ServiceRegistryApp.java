package edu.practice.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka server is a service registry(also called lookup server), All the microservices in the cluster register themselves to this server.
 */
@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceRegistryApp.class, args);
    }
}

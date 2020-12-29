package edu.practice.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * a simple REST service that provides movie information
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MovieServiceApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(MovieServiceApp.class, args);
    }
}

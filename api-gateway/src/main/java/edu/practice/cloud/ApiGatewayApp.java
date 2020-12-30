package edu.practice.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * adds the capability of operating as a proxy and routing requests to backend APIs.
 */
@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ApiGatewayApp.class, args);
    }
}

package edu.practice.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * a simple REST service but it internally calls the Movie Service to complete its requests.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RecommendationServiceApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(RecommendationServiceApp.class, args);
    }

    /**
     * Using @LoadBalanced we made RestTemplate ribbon aware/Client-side load balancing
     * @return
     */
    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

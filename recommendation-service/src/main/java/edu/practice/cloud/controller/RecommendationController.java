package edu.practice.cloud.controller;

import edu.practice.cloud.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class RecommendationController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/recommendations")
    public ResponseEntity<?> getMovies() {
//        ResponseEntity<Movie[]> response = restTemplate.exchange("http://movie-service/movies", HttpMethod.GET, null, Movie[].class);
        Movie[] result = restTemplate.getForObject("http://movie-service/movies", Movie[].class);
        System.out.println(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}

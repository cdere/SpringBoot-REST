package com.websystique.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import com.websystique.springboot.model.Quote;

@SpringBootApplication(scanBasePackages={"com.websystique.springboot"})
public class Application {

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
        //User user = restTemplate.getForObject("http://localhost:8080/SpringBootRestApi/api/user/", User.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
            System.out.println("======> " + quote.toString());
        };
    }
}
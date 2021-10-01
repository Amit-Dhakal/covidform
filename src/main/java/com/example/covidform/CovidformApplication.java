package com.example.covidform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CovidformApplication  {
    public static void main(String[] args) {
        SpringApplication.run(CovidformApplication.class, args);
    }
}




/*@EntityScan(basePackages = {"com.example.covidform.Model"})
@ComponentScan(basePackages = {"com.example.covidform.controller"})
@ComponentScan(basePackages = {"com.example.covidform.Services"})*/


//@EnableJpaRepositories(basePackages = {"com.example.covidform.Repository"})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
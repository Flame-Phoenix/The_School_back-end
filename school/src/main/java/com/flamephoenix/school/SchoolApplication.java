package com.flamephoenix.school;

import com.flamephoenix.school.repository.UserEntityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserEntityRepository.class)
public class SchoolApplication {

    public static void main(String[] args){
        SpringApplication.run(SchoolApplication.class , args);

    }
}

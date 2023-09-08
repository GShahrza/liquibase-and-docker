package com.example.springdocker;

import com.example.springdocker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDockerApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(studentRepository.getView());
    }
}

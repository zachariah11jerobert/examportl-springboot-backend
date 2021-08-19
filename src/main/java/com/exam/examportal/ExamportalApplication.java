package com.exam.examportal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamportalApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExamportalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("starting code");
    }
}

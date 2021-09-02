package com.exam.examportal;

import com.exam.examportal.model.Role;
import com.exam.examportal.model.User;
import com.exam.examportal.model.UserRole;
import com.exam.examportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamportalApplication implements CommandLineRunner {
    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ExamportalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("starting code");

//        User user=new User();
//
//        user.setFirstName("Durgesh");
//        user.setLastName("Tiwari");
//        user.setUsername("durgerg1234");
//        user.setPassword("abc");
//        user.setEmail("abc@gmail.com");
//        user.setProfile("default.png");
//
//        Role role1=new Role();
//        role1.setRoleId(44L);
//        role1.setRoleName("ADMIN");
//
//        Set<UserRole> userRoleSet=new HashSet<>();
//        UserRole userRole=new UserRole();
//        userRole.setRole(role1);
//        userRole.setUser(user);
//
//        userRoleSet.add(userRole);
//
//        User user1=this.userService.createUser(user,userRoleSet);
//        System.out.println(user1.getUsername());

    }
}

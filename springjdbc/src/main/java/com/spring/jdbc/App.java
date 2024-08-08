package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserDao userDao = context.getBean(UserDao.class);
        
        // Example usage
        User user = new User();
        user.setId(3 );
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        userDao.insertUser(user);

        User fetchedUser = userDao.getUserById(1);
        System.out.println("Fetched User: " + fetchedUser.getName() + " - " + fetchedUser.getEmail());
    }
}


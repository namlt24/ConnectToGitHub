package com.example.connecttogithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectToGitHubApplication {
    public static void addText(){
        System.out.println("Adding text");
    }
    public static void main(String[] args) {
        SpringApplication.run(ConnectToGitHubApplication.class, args);
    }

}

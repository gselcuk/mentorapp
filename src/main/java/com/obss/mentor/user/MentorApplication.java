package com.obss.mentor.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Spring boot application.
 * 
 * @author Goktug Selcuk
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MentorApplication extends SpringBootServletInitializer {

  /***
   * Main method of class.
   * 
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(MentorApplication.class, args);
  }

}

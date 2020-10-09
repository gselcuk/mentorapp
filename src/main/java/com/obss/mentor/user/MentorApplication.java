package com.obss.mentor.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Spring boot application.
 * 
 * @author Goktug Selcuk
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class MentorApplication extends SpringBootServletInitializer {

  /***
   * Main methodof class.
   * 
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(MentorApplication.class, args);
  }

}

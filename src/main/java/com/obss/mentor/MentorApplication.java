package com.obss.mentor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Spring boot application.
 * 
 * @author Goktug Selcuk
 *
 */
@SpringBootApplication
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

package com.obss.mentor.user.exception;

/**
 * Runtime exception for application.
 * 
 * @author Goktug Selcuk
 *
 */
public class MentorException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constructor for exception.
   * 
   * @param message
   */
  public MentorException(String message) {
    super(message);
  }

}

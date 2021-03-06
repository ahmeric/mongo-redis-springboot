package com.example.test.exception;

import lombok.Getter;

public class BookNotFoundException extends Exception {

  @Getter private final String message;

  public BookNotFoundException(String exceptionMessage) {
    super(exceptionMessage);
    this.message = exceptionMessage;
  }
}

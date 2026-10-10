package com.haponenka.pizza.exceptions;

public class PizzaNotExistingException extends RuntimeException {
  public PizzaNotExistingException() {}

  public PizzaNotExistingException(String message) {
    super(message);
  }

  public PizzaNotExistingException(String message, Throwable cause) {
    super(message, cause);
  }

  public PizzaNotExistingException(Throwable cause) {
    super(cause);
  }
}

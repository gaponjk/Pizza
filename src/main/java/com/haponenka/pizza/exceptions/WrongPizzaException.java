package com.haponenka.pizza.exceptions;

public class WrongPizzaException extends RuntimeException {
    public WrongPizzaException(String message) {
        super(message);
    }

    public WrongPizzaException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPizzaException(Throwable cause) {
        super(cause);
    }

    public WrongPizzaException() {
    }
}

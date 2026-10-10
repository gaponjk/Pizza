package com.haponenka.pizza.exceptions;

public class WrongPizzaStoreException extends RuntimeException {
    public WrongPizzaStoreException(String message) {
        super(message);
    }

    public WrongPizzaStoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPizzaStoreException(Throwable cause) {
        super(cause);
    }

    public WrongPizzaStoreException() {
    }
}

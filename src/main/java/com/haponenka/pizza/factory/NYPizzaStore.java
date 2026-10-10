package com.haponenka.pizza.factory;

import com.haponenka.pizza.entity.Pizza;
import com.haponenka.pizza.entity.ny.NYStyleCheesePizza;
import com.haponenka.pizza.entity.ny.NYStylePepperoniPizza;
import java.util.Optional;

public class NYPizzaStore extends PizzaStore {
  @Override
  protected Optional<Pizza> createPizza(String type) {
    switch (type) {
      case "cheese" -> {
        return Optional.of(new NYStyleCheesePizza());
      }
      case "pepperoni" -> {
        return Optional.of(new NYStylePepperoniPizza());
      }
    }
    return Optional.empty();
  }
}

package com.haponenka.pizza.factory;

import com.haponenka.pizza.entity.Pizza;
import com.haponenka.pizza.entity.ny.NYStyleCheesePizza;
import com.haponenka.pizza.entity.ny.NYStylePepperoniPizza;
import java.util.Optional;

public class NYPizzaStore extends PizzaStore {
  @Override
  protected Optional<Pizza> createPizza(String type) {
    return switch (type.toLowerCase()) {
      case "cheese" -> Optional.of(new NYStyleCheesePizza());
      case "pepperoni" -> Optional.of(new NYStylePepperoniPizza());
      default -> Optional.empty();
    };
  }
}

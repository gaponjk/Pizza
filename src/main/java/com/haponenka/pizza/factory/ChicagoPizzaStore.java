package com.haponenka.pizza.factory;

import com.haponenka.pizza.entity.Pizza;
import com.haponenka.pizza.entity.chicago.ChicagoStyleCheesePizza;
import com.haponenka.pizza.entity.chicago.ChicagoStylePepperoniPizza;
import java.util.Optional;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Optional<Pizza> createPizza(String type) {
    switch (type) {
      case "cheese" -> {
        return Optional.of(new ChicagoStyleCheesePizza());
      }
      case "pepperoni" -> {
        return Optional.of(new ChicagoStylePepperoniPizza());
      }
    }
    return Optional.empty();
  }
}

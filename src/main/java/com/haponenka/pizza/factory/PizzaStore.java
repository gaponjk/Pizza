package com.haponenka.pizza.factory;

import com.haponenka.pizza.entity.Pizza;
import com.haponenka.pizza.exceptions.PizzaNotExistingException;
import java.util.Optional;

public abstract class PizzaStore {
  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = createPizza(type).orElseThrow(() -> new PizzaNotExistingException(type));

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  protected abstract Optional<Pizza> createPizza(String type);
}

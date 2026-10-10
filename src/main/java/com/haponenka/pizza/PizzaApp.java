package com.haponenka.pizza;

import com.haponenka.pizza.entity.Pizza;
import com.haponenka.pizza.factory.ChicagoPizzaStore;
import com.haponenka.pizza.factory.NYPizzaStore;
import com.haponenka.pizza.factory.PizzaStore;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PizzaApp {
  private static final Logger log = LogManager.getLogger(PizzaApp.class);

  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      PizzaStore pizzaStore = chooseStore(reader);
      Pizza pizza = choosePizza(reader, pizzaStore);
      log.info("You ordered {}", pizza.getName());
    } catch (IOException e) {
      log.error("Reading error", e);
    }
  }

  private static PizzaStore chooseStore(BufferedReader reader) {
    while (true) {
      System.out.println("Choose Pizza Store:\n1. Chicago\n2. New York");
      try {
        String input = reader.readLine().strip();
        switch (input) {
          case "1" -> {
            return new ChicagoPizzaStore();
          }
          case "2" -> {
            return new NYPizzaStore();
          }
          default -> log.warn("Invalid store choice: '{}'. Please select 1 or 2.", input);
        }
      } catch (IOException e) {
        log.error("Failed to read store selection", e);
      }
    }
  }

  private static Pizza choosePizza(BufferedReader reader, PizzaStore pizzaStore) {
    while (true) {
      System.out.println("Choose Pizza:\n1. Cheese\n2. Pepperoni");
      try {
        String input = reader.readLine().strip();
        switch (input) {
          case "1" -> {
            return pizzaStore.orderPizza("cheese");
          }
          case "2" -> {
            return pizzaStore.orderPizza("pepperoni");
          }
          default -> log.warn("Invalid pizza choice: '{}'. Please select 1 or 2.", input);
        }
      } catch (IOException e) {
        log.error("Failed to read pizza selection", e);
      }
    }
  }
}

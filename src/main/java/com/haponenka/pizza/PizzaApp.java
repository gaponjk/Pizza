package com.haponenka.pizza;

import com.haponenka.pizza.entity.Pizza;
import com.haponenka.pizza.exceptions.WrongPizzaException;
import com.haponenka.pizza.exceptions.WrongPizzaStoreException;
import com.haponenka.pizza.factory.ChicagoPizzaStore;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.haponenka.pizza.factory.NYPizzaStore;
import com.haponenka.pizza.factory.PizzaStore;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PizzaApp {
  private static final Logger log = LogManager.getLogger(PizzaApp.class);

  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        PizzaStore pizzaStore;
        log.info("Choose Pizza Store:\n1.Chicago\n2.New York");
        int choosingPizzaStore = Integer.parseInt(reader.readLine().strip());
        switch (choosingPizzaStore) {
            case 1 -> {
                pizzaStore=new ChicagoPizzaStore();
            }
            case 2 -> {
                pizzaStore=new NYPizzaStore();
            }
            default -> {
                throw new WrongPizzaStoreException();
            }
        }
        log.info("Choose Pizza:\n1.Cheese\n2.Pepperoni");
      int choosingPizza = Integer.parseInt(reader.readLine().strip());
        Pizza pizza;
      switch (choosingPizza) {
        case 1 -> {
            pizza= pizzaStore.orderPizza("cheese");
        }
        case 2 -> {
            pizza=pizzaStore.orderPizza("pepperoni");
        }
          default -> {
            throw new WrongPizzaException();
          }
      }
      log.info("You ordered {}", pizza.getName());
    } catch (IOException e) {
      log.error("Reading error");
    }
  }
}

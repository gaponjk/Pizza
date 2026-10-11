package com.haponenka.pizza.factory;

import static org.junit.jupiter.api.Assertions.*;

import com.haponenka.pizza.entity.Pizza;
import com.haponenka.pizza.entity.chicago.ChicagoStyleCheesePizza;
import com.haponenka.pizza.entity.chicago.ChicagoStylePepperoniPizza;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ChicagoPizzaStoreTest {

  @Test
  @DisplayName("Should successfully order and prepare cheese pizza")
  void createPizza_whenTypeisCheese_shouldReturnChicagoStyleCheesePizza() {
    // Given
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    String pizzaType = "cheese";
    // When
    Optional<Pizza> chicagoPizza = chicagoPizzaStore.createPizza(pizzaType);
    // Then
    assertTrue(chicagoPizza.isPresent());
    assertEquals(ChicagoStyleCheesePizza.class, chicagoPizza.get().getClass());
  }

  @Test
  @DisplayName("Should successfully order and prepare pepperoni pizza")
  void createPizza_whenTypeisPepperoni_shouldReturnChicagoStylePepperoniPizza() {
    // Given
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    String pizzaType = "pepperoni";
    // When
    Optional<Pizza> chicagoPizza = chicagoPizzaStore.createPizza(pizzaType);
    // Then
    assertTrue(chicagoPizza.isPresent());
    assertEquals(ChicagoStylePepperoniPizza.class, chicagoPizza.get().getClass());
  }

  @Test
  @DisplayName("Should return empty Optional")
  void createPizza_whenTypeisWrong() {
    // Given
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    String pizzaType = "hawaii";
    // When
    Optional<Pizza> chicagoPizza = chicagoPizzaStore.createPizza(pizzaType);
    // Then
    assertTrue(chicagoPizza.isEmpty());
  }
}

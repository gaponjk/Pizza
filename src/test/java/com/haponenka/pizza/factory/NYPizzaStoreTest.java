package com.haponenka.pizza.factory;

import static org.junit.jupiter.api.Assertions.*;

import com.haponenka.pizza.entity.Pizza;
import com.haponenka.pizza.entity.ny.NYStyleCheesePizza;
import com.haponenka.pizza.entity.ny.NYStylePepperoniPizza;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NYPizzaStoreTest {
  @Test
  @DisplayName("Should successfully order and prepare cheese pizza")
  void createPizza_whenTypeisCheese_shouldReturnNYStyleCheesePizza() {
    // Given
    PizzaStore nyPizzaStore = new NYPizzaStore();
    String pizzaType = "cheese";
    // When
    Optional<Pizza> nyPizza = nyPizzaStore.createPizza(pizzaType);
    // Then
    assertTrue(nyPizza.isPresent());
    assertEquals(NYStyleCheesePizza.class, nyPizza.get().getClass());
  }

  @Test
  @DisplayName("Should successfully order and prepare pepperoni pizza")
  void createPizza_whenTypeIsPepperoni_shouldReturnNYStylePepperoniPizza() {
    // Given
    PizzaStore nyPizzaStore = new NYPizzaStore();
    String pizzaType = "pepperoni";
    // When
    Optional<Pizza> nyPizza = nyPizzaStore.createPizza(pizzaType);
    // Then
    assertTrue(nyPizza.isPresent());
    assertEquals(NYStylePepperoniPizza.class, nyPizza.get().getClass());
  }

  @Test
  @DisplayName("Should return empty Optional")
  void createPizza_whenTypeisWrong() {
    // Given
    PizzaStore nyPizzaStore = new NYPizzaStore();
    String pizzaType = "hawaii";
    // When
    Optional<Pizza> nyPizza = nyPizzaStore.createPizza(pizzaType);
    // Then
    assertTrue(nyPizza.isEmpty());
  }
}

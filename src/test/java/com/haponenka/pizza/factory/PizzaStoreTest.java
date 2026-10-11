package com.haponenka.pizza.factory;

import static org.junit.jupiter.api.Assertions.*;

import com.haponenka.pizza.entity.Pizza;
import com.haponenka.pizza.exceptions.PizzaNotExistingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class PizzaStoreTest {
  @Test
  @DisplayName("Should successfully order and prepare pepperoni pizza")
  void createPizza_whenTypeisPepperoni_shouldReturnChicagoStylePepperoniPizza() {
    // Given
    PizzaStore pizzaStore = new NYPizzaStore();
    String pizzaType = "pepperoni";
    // When
    Pizza nyPizza = pizzaStore.orderPizza(pizzaType);
    // Then
    assertNotNull(nyPizza);
  }

  @Test
  @DisplayName("Should throw PizzaNotExistingException")
  void orderPizza_whenTypeisWrong_shouldThrowException() {
    // Given
    PizzaStore pizzaStore = new NYPizzaStore();
    String invalidType = "hawaii";
    // When
    Executable orderAction = () -> pizzaStore.orderPizza(invalidType);
    // Then
    assertThrows(PizzaNotExistingException.class, orderAction);
  }
}

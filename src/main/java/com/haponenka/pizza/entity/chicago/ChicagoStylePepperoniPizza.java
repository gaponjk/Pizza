package com.haponenka.pizza.entity.chicago;

import com.haponenka.pizza.entity.Pizza;
import java.util.List;

public class ChicagoStylePepperoniPizza extends Pizza {
  public ChicagoStylePepperoniPizza() {
    super(
        "Chicago Style Pepperoni",
        "Extra Thick Crust Dough",
        "Plum Tomato Sauce",
        List.of("Pepperoni Slices"));
  }
}

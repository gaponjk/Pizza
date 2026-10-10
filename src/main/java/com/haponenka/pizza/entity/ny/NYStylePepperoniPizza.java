package com.haponenka.pizza.entity.ny;

import com.haponenka.pizza.entity.Pizza;
import java.util.List;

public class NYStylePepperoniPizza extends Pizza {
  public NYStylePepperoniPizza() {
    super(
        "NY City Style Pepperoni Pizza",
        "Thin Crust Dough",
        "Marinara Sauce",
        List.of("Pepperoni Slices"));
  }
}

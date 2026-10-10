package com.haponenka.pizza.entity.ny;

import com.haponenka.pizza.entity.Pizza;
import java.util.List;

public class NYStyleCheesePizza extends Pizza {
  public NYStyleCheesePizza() {
    super(
        "NY City Style Cheese Pizza",
        "Thin Crust Dough",
        "Marinara Sauce",
        List.of("Shredded Mozzarella Cheese"));
  }
}

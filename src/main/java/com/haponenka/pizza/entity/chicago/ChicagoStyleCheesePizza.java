package com.haponenka.pizza.entity.chicago;

import com.haponenka.pizza.entity.Pizza;
import java.util.List;

public class ChicagoStyleCheesePizza extends Pizza {
  public ChicagoStyleCheesePizza() {
    super(
        "Chicago Style Cheese Pizza",
        "Extra Thick Crust Dough",
        "Plum Tomato Sauce",
        List.of("Shredded Mozzarella Cheese"));
  }
}

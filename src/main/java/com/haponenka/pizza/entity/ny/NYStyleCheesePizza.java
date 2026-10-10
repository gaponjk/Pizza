package com.haponenka.pizza.entity.ny;

import com.haponenka.pizza.entity.Pizza;

public class NYStyleCheesePizza extends Pizza {
  public NYStyleCheesePizza() {
    name = "NY City Style Cheese Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";
    ingredients.add("Shredded Mozzarella Cheese");
  }
}

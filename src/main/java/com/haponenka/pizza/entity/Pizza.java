package com.haponenka.pizza.entity;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Pizza {
  private static final Logger log = LogManager.getLogger(Pizza.class);
  private final String name;
  private final String dough;
  private final String sauce;
  private final List<String> ingredients;

  protected Pizza(String name, String dough, String sauce, List<String> ingredients) {
    this.name = name;
    this.dough = dough;
    this.sauce = sauce;
    this.ingredients = List.copyOf(ingredients); // иммутабельный список
  }

  public void prepare() {
    log.info("Preparing {}", name);
    log.info("Tossing dough {}...", dough);
    log.info("Adding sauce {}...", sauce);
    log.info("Adding other ingredients: ");
    log.info("Adding other ingredients: {}", String.join(", ", ingredients));
  }

  public void bake() {
    log.info("Baking pizza...");
  }

  public void cut() {
    log.info("Cutting pizza...");
  }

  public void box() {
    log.info("Boxing pizza...");
  }

  public String getName() {
    return name;
  }
}

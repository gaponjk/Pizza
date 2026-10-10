package com.haponenka.pizza.entity;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Pizza {
  private static final Logger log = LogManager.getLogger(Pizza.class);
  protected String name;
  protected String dough;
  protected String sauce;
  protected List<String> ingredients = new ArrayList<>();

  public void prepare() {
    log.info("Preparing {}", name);
    log.info("Tossing dough...");
    log.info("Adding sauce...");
    log.info("Adding other ingredients: ");
    for (String ingredient : ingredients) {
      log.info("{} ", ingredient);
    }
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

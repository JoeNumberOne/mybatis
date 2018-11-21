package com.joe.pojo;


public class Flower {

  private long id;
  private String name;
  private double price;
  private String production;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getProduction() {
    return production;
  }

  public void setProduction(String production) {
    this.production = production;
  }

  @Override
  public String toString() {
    return "Flower{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", production='" + production + '\'' +
            '}';
  }
}

package com.company;

public class Card {

  public double balance;
  public double interestRate;
  public String brand;
  public String name;

  public Card() {

  }

  public void adjustBalance(double amount) {

    this.balance += amount;
  }

}

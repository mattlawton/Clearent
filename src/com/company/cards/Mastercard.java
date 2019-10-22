package com.company.cards;

import com.company.Card;

public class Mastercard extends Card {

    public Mastercard(String name) {

        this.brand = "mastercard";
        this.interestRate = .05;
        this.name = name;
    }
}

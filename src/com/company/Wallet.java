package com.company;

import java.util.ArrayList;
import java.util.List;

public class Wallet {

   private List<Card> cards = new ArrayList<>();
   String name;

   public Wallet(String name) {

       this.name = name;
   }

    public Card getCardByName(String name) {
        for (Card c : this.getCards()) {
            if (c.name.equals(name)) return c;
        }
        return null;
    }

    public void addCard(Card c) {
        this.getCards().add((c));
    }

    public List<Card> getCards() {
        return cards;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Interest {

    public static List getInterest(Person person) {
        List<Double> interests = new ArrayList<>();
        for (Wallet w : person.getWallets()) {
            for(Card c : w.getCards())
                interests.add(c.interestRate * c.balance);
        }

        return interests;
    }

    public static List getWalletInterest(Person person, String name) {
        List<Double> interests = new ArrayList<>();
        for (Card c : person.getWalletByName(name).getCards())
            interests.add(c.interestRate * c.balance);

        return interests;
    }

    public static double getWalletTotalInterest(Person person, String name) {
        double total = 0;
        for(Card c : person.getWalletByName(name).getCards())
            total += c.interestRate * c.balance;

        return total;
    }

    public static double getTotalInterest(Person person) {
        double total = 0;
        for (Wallet w : person.getWallets()) {
            for(Card c : w.getCards())
                total += c.interestRate * c.balance;
        }

        return total;
    }
}

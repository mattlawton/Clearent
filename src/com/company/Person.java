package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<Wallet> wallets = new ArrayList<>();

    public Person() {

    }

    public void addWallet(String name) {
        this.getWallets().add(new Wallet(name));
    }

    public Wallet getWalletByName(String name) {
        for (Wallet w : this.getWallets()) {
            if (w.name.equals(name)) return w;
        }
        return null;
    }

    public List<Wallet> getWallets() {
        return wallets;
    }
}

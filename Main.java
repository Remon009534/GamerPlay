package com.company;

public class Main {


    public static void main(String[] args) {
        ReadyPlayer p1 = new ReadyPlayer("Raad Shahmat Remon", "@Remon2017", 1000, "Bronze", "Ready Subscription", 200);

        int eliteCoins = 100;

        p1.buyELiteCoins(eliteCoins);

        p1.showInfo();
        System.out.println(p1.getEliteCoins());
    }
}

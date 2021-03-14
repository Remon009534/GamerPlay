package com.company;

public class Main {


    public static void main(String[] args) {
        ReadyPlayer p1 = new ReadyPlayer("Raad Shahmat Remon",  1000, 200);


//        p1.buyELiteCoins(eliteCoins);

        int gamerPoints = 4000;

        String UserName = "@ rEon2017";

        String subscriptionType = "ELite Subscription";

        p1.showInfo();
        p1.PlayerTierTracker(gamerPoints);
        p1.buyELiteCoins(subscriptionType);
        p1.userNameCreator(UserName);

    }
}

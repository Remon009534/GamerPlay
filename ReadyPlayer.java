package com.company;

public class ReadyPlayer {
    private static int id;
    private String FullName;
    private String UserName;
    private int gamerPoints;
    private String playerTier;
    private String subscriptionType;
    private int readyCoins;
    private int eliteCoins;

    public ReadyPlayer(String FullName, int readyCoins, int eliteCoins)
    {
        this.id += 1;
        this.FullName = FullName;
        this.UserName = UserName;
        this.gamerPoints = gamerPoints;
        this.playerTier = playerTier;
        this.subscriptionType = subscriptionType;
        this.readyCoins = readyCoins;
        this.eliteCoins = eliteCoins;
    }

    public String getFullName()
    {
        return FullName;
    }
    public void setFullName(String FullName)
    {
        this.FullName = FullName;
    }
    public String getUserName()
    {
        return UserName;
    }
    public void setUserName(String UserName)
    {
        this.UserName = UserName;
    }
    public int getGamerPoints()
    {
        return gamerPoints;
    }
    public void setGamerPoints(int gamerPoints)
    {
        this.gamerPoints = gamerPoints;
    }
    public String getPlayerTier()
    {
        return playerTier;
    }
    public void setPlayerTier(String playerTier)
    {
        this.playerTier = playerTier;
    }
    public String getSubscriptionType()
    {
        return subscriptionType;
    }
    public void setSubscriptionType(String subscriptionType)
    {
        this.subscriptionType = subscriptionType;
    }
    public int getReadyCoins()
    {
        return readyCoins;
    }
    public void setReadyCoins(int readyCoins)
    {
        this.readyCoins = readyCoins;
    }
    public int getEliteCoins()
    {
        return eliteCoins;
    }
    public void setEliteCoins(int eliteCoins)
    {
        this.eliteCoins = eliteCoins;
    }
    public String userNameCreator(String UserName)
    {

        if( UserName  == "@" + UserName)
        {
            return UserName;
        }
        else
        {
            System.out.println("Your username should start with @");
        }
        return UserName;
    }
    public String PlayerTierTracker(int gamerPoints)
    {
        if(gamerPoints >= 0 && gamerPoints <= 999 )
        {
            System.out.println("Bronze");
        }
        else if(gamerPoints >= 1000 && gamerPoints <= 1999)
        {
            System.out.println("Silver");
        }
        else if(gamerPoints >= 2000 && gamerPoints <= 2999)
        {
            System.out.println("Gold");
        }
        else if(gamerPoints >= 3000 && gamerPoints <= 3999)
        {
            System.out.println("Diamond");
        }
        else if(gamerPoints >= 4000)
        {
            System.out.println("Platinum");
        }

        return playerTier;
    }
    public void showInfo()
    {
        System.out.println("Name:- " + FullName);
        System.out.println("Username:- " + UserName);
        System.out.println("GamerTotalPoints:- " + gamerPoints);
        System.out.println("Subscription:- " + subscriptionType);
        System.out.println("ReadyCoins:- " + readyCoins);
    }
    public int buyELiteCoins(String subscriptionType)
    {
        if(subscriptionType == "ELite Subscription")
        {
            System.out.println(eliteCoins);
        }
        else
        {
            System.out.println("You have to be a Elite Subscription");
        }

        return eliteCoins;
    }

}

package com.example.demo;

public class Fteam
{
    private Player[] fteam;//unsorted list of players on the team
    private int size;//size of team
    Fteam()//constructs empty team of 0 players
    {
        fteam = new Player[0];
        this.size=0;
    }
    Fteam(int size)//creates a fantasy team with the size given by the league rules
    {
        fteam= new Player[size];
        this.size=size;
    }
    public boolean addPlayer(int playerID)//adds player to the team using the player ID. Player data would be gathered by database here// assumes that playerID is a valid id in the database
    {
        int i=0;//counter for which index of fteam we are on
        for (Player p : fteam)//increments through each player p in fteam
        {
            if (p==null)//if there is no player at this index
            {
                fteam[i] = new Player(playerID);
                System.out.println("Player with playerID of:" +playerID+" has been added the team");
                return true;
            }
            else if(p.getPlayerID()==playerID)
            {
                System.out.println("Player is already on the team");
                return false;
            }
            i++;
        }
        System.out.println("No room for the player on the team");
        return false;
    }
    public boolean addPlayer(Player toAdd)//adds player to the team using the player ID. Player data would be gathered by database here// assumes that playerID is a valid id in the database
    {
        int i=0;//counter for which index of fteam we are on
        for (Player p : fteam)//increments through each player p in fteam
        {
            if (p==null)//if there is no player at this index
            {
                fteam[i] = toAdd;
                System.out.println("Player with playerID of:" +toAdd.getPlayerID()+" has been added the team");
                return true;
            }
            else if(p.getPlayerID()== toAdd.getPlayerID())
            {
                System.out.println("Player is already on the team");
                return false;
            }
        i++;
        }
    System.out.println("No room for the player on the team");
    return false;
    }
    public boolean removePlayer(int playerID)
    {
        int i=0;
        for (Player p: fteam)
        {
            if(p!=null && p.getPlayerID()==playerID)
            {
                fteam[i] = null;
                System.out.println("Player with playerID of "+playerID+" has been removed");
                return true;
            }
            i++;
        }
        System.out.println("Player with playerID of "+playerID+" is not on the team to remove");
        return false;
    }
    public Player[] getFteam()
    {
        return fteam;
    }
    public void printTeam()
    {
        for(Player p : fteam)
        {
            if(p!=null)
            {
                p.printPlayer();
            }
        }
    }
}

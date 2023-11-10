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
    public void addPlayer(int playerID)//adds player to the team using the player ID. Player data would be gathered by database here// assumes that playerID is a valid id in the database
    {
        int i=0;
        for (Player p : fteam)
        {
            if (p.getPlayerID() != playerID && p.getPlayerID()==-1)
            {
                fteam[i]=new Player(playerID);
                system.print.out("Player has been added the team");
                return;
            }
            else if(p.getPlayerID()==playerID)
            {
                system.print.out("Player is already on the team");
                return;
            }
            i++;
        }
        system.out.print("No room for the player on the team");
    }
}

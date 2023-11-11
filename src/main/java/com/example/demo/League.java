package com.example.demo;
public class League
{
    private static int size;
    public static void main(String[] args)
    {
        size =5;
        Fteam team1= new Fteam(size);
        team1.printTeam();
        team1.addPlayer(15964);
        Player toAdd = new Player(25.8, "Kirk Cousins",15964,8,"Vikings",1,4);
        team1.addPlayer(toAdd);
        team1.printTeam();
        team1.removePlayer(15964);
        team1.printTeam();
        team1.addPlayer(toAdd);
        team1.printTeam();
    }
}

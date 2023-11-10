package com.example.demo;
public class League
{
    private static int size;
    public static void main(String[] args)
    {
        size =5;
        Fteam team1= new Fteam(size);
        team1.printTeam();
        for (int i=0;i<size;i++)
        {
            team1.addPlayer(i);
        }
        team1.printTeam();
        for (int i=0;i<size+1;i=i+2)
        {
            team1.removePlayer(i);
        }
        team1.printTeam();
        for (int i=0;i<size;i++)
        {
            team1.addPlayer(i);
        }
        team1.printTeam();
    }
}

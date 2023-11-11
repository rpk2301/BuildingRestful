package com.example.demo;
public class League
{
    private static int size;
    public static void main(String[] args)//testing functions of Player and Fteam
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
        toAdd = new Player(25.8, "Kirk Cousins",15964,8,"Vikings",1,4);
        team1.addPlayer(toAdd);
        toAdd = new Player(2.8, "Davante Adams",17514,17,"Raiders",3,0);
        team1.addPlayer(toAdd);
        toAdd = new Player(2, "DK Metcalf",98704,14,"Seahawks",3,1);
        team1.addPlayer(toAdd);
        team1.removePlayer(toAdd.getPlayerID());
        toAdd = new Player(984, "Christian McCaffery",94521,23,"49ers",2,3);
        team1.addPlayer(toAdd);
        team1.printTeam();
        team1.getScore();
    }
    private Fteam compare(Fteam t1, Fteam t2)// compares two teams score and returns the higher team. DOES NOTHING FOR TIES ATM
    {
        if(t1==null||t2==null)
        {
            System.out.println("please send two populated teams");
            return null;
        }
        if (t1.getScore()>t2.getScore())
        {
            return t1;
        }
        else if (t2.getScore()>t1.getScore())
        {
            return t2;
        }
        else
        {
            return t1;
        }
    }
}

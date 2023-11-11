package com.example.demo;

public class Player
{
    private double score; // Players Fantasy score. if score is -99 then player has no recorded score
    private final String name;//Player Name
    private int jersey;//Jersey number
    private String team;//NFL team player is on
    private int position;//NFL position as an Int(QB:1,RB:2,WR:3,TE:4;K:5,D/ST:6,LB:7,DL:8,DB9)
    private final int playerID;//Unique ID for player to differentiate players of the same name (ie Josh Allen)
    private int injury;//shows injury status as int(healthy=0;questionable=1;doubtful=2;out=3;ir=4;PUP=5;suspended=6)
    Player()//default constructor
    {
        this.score = -99;
        this.name = "probably named ricky";
        this.playerID = -1;
        this.jersey = 21;
        this.team = "FA";
        this.position = 0;
        this.injury = 0;
    }
    Player(double score, String name,int playerID, int jersey, String team, int position, int injury)//Creates the player object with full data
    {
        this.score=score;
        this.name=name;
        this.playerID=playerID;
        this.jersey=jersey;
        this.team=team;
        this.position=position;
        this.injury=injury;
    }
    Player(String name, int jersey,int playerID, String team, int position,int injury)//Creates the player object with no score of the week
    {
        this.score=-99;
        this.name=name;
        this.playerID=playerID;
        this.jersey=jersey;
        this.team=team;
        this.position=position;
        this.injury=injury;
    }
    Player(double score, String name, int jersey, int playerID, int position, int injury)//Create the player object without being on an NFL roster (free agent)
    {
        this.score=score;
        this.name=name;
        this.playerID=playerID;
        this.jersey=jersey;
        this.team="FA";
        this.position=position;
        this.injury=injury;
    }
    Player(int playerID)//Constructor to make a player with only the player id Which we might have using the database idk yet
    {
        this.score = -99;
        this.name = "probably named ricky";
        this.playerID = playerID;
        this.jersey = 21;
        this.team = "FA";
        this.position = 0;
        this.injury = 0;
    }
    public double getScore()//returns player score
    {
        return score;
    }
    public String getName() //returns player name
    {
        return name;
    }
    public int getJersey() //returns player jersey
    {
        return jersey;
    }
    public int getPosition()//returns player position
    {
        return position;
    }
    public String getTeam() //returns player team
    {
        return team;
    }
    public int getPlayerID() //returns playerID
    {
        return playerID;
    }
    public int getInjury()
    {
        return injury;
    }
    public void setScore(double score)//sets/updates players score
    {
        this.score = score;
    }
    public void setJersey(int jersey) //sets new jersey
    {
        this.jersey = jersey;
    }
    public void setPosition(int position) //sets new position
    {
        this.position = position;
    }
    public void setTeam(String team) //sets new team
    {
        this.team = team;
    }
    public void setInjury(int injury)
    {
        this.injury = injury;
    }
    private String convertPosition()
    {
        if (position==0)
        {
            return "Test pos";
        }
        else if (position==1)
        {
            return "QB";
        }
        return "ruh roh";
    }
    public void printPlayer()
    {
        System.out.println(name+"\tPosition:"+position+"\tJersey number:"+jersey+"\tTeam:"+team+"\tPlayerID:"+playerID+"\tInjury status:"+injury+"\tScore:"+score);
    }
}
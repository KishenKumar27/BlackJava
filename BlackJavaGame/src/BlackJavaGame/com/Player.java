package BlackJavaGame.com;

import java.util.*;

public class Player {
    private int id;
    private String Name;
    private int PlayerScore;
    Stack<String> cards = new Stack<String>();


    //Constructor
    public Player(int id, String name) {
        this.id = id;
        this.Name = name;

    }


    //Getters and setters
    public int getId() {
        return id;
    }


    public String getPlayerName() {
        return Name;
    }


    public Stack<String> getCards() {
        return cards;
    }

    public void setPoints(int p) {
        this.PlayerScore = p;
    }

    public int getPlayerScore() {
        return PlayerScore;
    }


}

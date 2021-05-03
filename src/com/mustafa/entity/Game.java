package com.mustafa.entity;

public class Game {

    private int id;
    private String gameName;
    private String gameDescription;
    private double gameValue;

    public Game() {

    }

    public Game(int id, String gameName, String gameDescription, double gameValue) {
        this.id = id;
        this.gameName = gameName;
        this.gameDescription = gameDescription;
        this.gameValue = gameValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public double getGameValue() {
        return gameValue;
    }

    public void setGameValue(double gameValue) {
        this.gameValue = gameValue;
    }

}

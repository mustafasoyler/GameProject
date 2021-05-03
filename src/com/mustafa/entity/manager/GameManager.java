package com.mustafa.entity.manager;

import com.mustafa.entity.Game;
import com.mustafa.entity.service.GameService;

public class GameManager implements GameService {

    @Override
    public void addGame(Game games) {
        System.out.println(" Username : " + games.getGameName() + " is added.");

    }

    @Override
    public void removeGame(Game games) {
        System.out.println(" Username : " + games.getGameName() + " is removed.");

    }

    @Override
    public void updateGame(Game games) {
        System.out.println(" Username : " + games.getGameName() + " is updated.");

    }

    @Override
    public void getAllGame(Game[] games) {
        for(Game game : games) {
            System.out.println(" Username : " + game.getGameName() + ".");
        }

    }

}


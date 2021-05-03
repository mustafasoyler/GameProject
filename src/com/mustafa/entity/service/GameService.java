package com.mustafa.entity.service;

import com.mustafa.entity.Game;

public interface GameService {

     void addGame(Game games);
     void removeGame(Game games);
     void updateGame(Game games);
     void getAllGame(Game[] games);
}

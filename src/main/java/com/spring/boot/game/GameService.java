package com.spring.boot.game;

import org.springframework.stereotype.Service;

@Service
public class GameService {
    private final GameRunner gameRunner;

    public GameService(GameRunner gameRunner) {
        this.gameRunner = gameRunner;
    }

    public void playGame(){
        gameRunner.run();
    }

}

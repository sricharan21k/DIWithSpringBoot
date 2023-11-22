package com.spring.boot.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final Game game;

    public GameRunner(Game game) {
        this.game = game;
    }

    public void run(){
        game.up();
        game.down();
    }
}

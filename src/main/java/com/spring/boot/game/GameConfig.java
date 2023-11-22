package com.spring.boot.game;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
    @Value("${game.active}")
    private String activeGame;

    @Bean
    Game game(){
        return switch (activeGame) {
            case "mario" -> new Mario();
            case "contra" -> new Contra();
            default -> throw new IllegalArgumentException("Game doesn't exist");
        };
    }

    @Bean
    Contra contra(){
        return new Contra();
    }


}

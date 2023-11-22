package com.spring.boot.game;

public class Mario implements Game{
    @Override
    public void up() {
        System.out.println("mario jumped...");
    }

    @Override
    public void down() {
        System.out.println("mario ducked... ");
    }
}

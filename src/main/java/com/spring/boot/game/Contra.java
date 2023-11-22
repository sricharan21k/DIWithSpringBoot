package com.spring.boot.game;

public class Contra implements Game{
    @Override
    public void up() {
        System.out.println("shoot...");
    }

    @Override
    public void down() {
        System.out.println("defend...");
    }
}

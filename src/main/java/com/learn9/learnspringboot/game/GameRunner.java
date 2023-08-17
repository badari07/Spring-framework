package com.learn9.learnspringboot.game;

public class GameRunner {
    private final GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
       System.out.println("running game: " + game );

       game.up();
       game.down();
       game.right();
       game.left();
    }
}

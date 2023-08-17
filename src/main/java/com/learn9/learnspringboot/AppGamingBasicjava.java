package com.learn9.learnspringboot;

import com.learn9.learnspringboot.game.GameRunner;
import com.learn9.learnspringboot.game.MarioGame;
import com.learn9.learnspringboot.game.PacmanGame;
import com.learn9.learnspringboot.game.SuperContraGame;

public class AppGamingBasicjava {
    public static void main(String[] args) {

        //var game= new MarioGame();
        //var game =new SuperContraGame();

        var game =new PacmanGame();

        var gameRunner= new GameRunner(game);

        gameRunner.run();

    }
}


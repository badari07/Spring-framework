package com.learn9.learnspringboot.game;

public class MarioGame implements GamingConsole{

    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("Go into a hole");
    }

    public void left(){
        System.out.println("GO back");
    }

    public void right(){
        System.out.println("Accelarate");
    }
}

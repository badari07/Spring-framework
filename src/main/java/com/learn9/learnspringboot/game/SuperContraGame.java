package com.learn9.learnspringboot.game;

public class SuperContraGame implements GamingConsole {

    public void up(){
        System.out.println("up");
    }
    public void down(){
        System.out.println("Sit down");
    }

    public void left(){
        System.out.println("GO back");
    }

    public void right(){
        System.out.println("Shoot a bullet");
    }
}

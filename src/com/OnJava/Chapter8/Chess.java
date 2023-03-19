package com.OnJava.Chapter8;


class Game {
    Game(int i) {
        System.out.println("Game");
    }
}

class BoardGame extends Game{
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame");
    }
}

public class Chess extends BoardGame{
    public Chess(int i) {
        super(i);
        System.out.println("Chess");
    }

    public static void main(String[] args) {
        new Chess(1);
    }
}

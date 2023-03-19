package com.OnJava.Chapter9.polymorphism;

class Actor {
    public void act() {}
}

class HappyActor extends Actor {
    @Override public void act() {
        System.out.println("Happy Actor");
    }
}

class SadActor extends Actor {
    @Override public void act() {
        System.out.println("Sad Actor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}

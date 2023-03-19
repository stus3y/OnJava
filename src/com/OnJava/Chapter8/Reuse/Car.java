package com.OnJava.Chapter8.Reuse;

class Engine {
    public void start() {}
    public void stop() {}
}

class Window {
    public void rollup() {}
    public void rolldown() {}
}

class Wheel {
    public void inflate(int psi) {}
}

class Door {
    public Window window = new Window();
    public void open() {}
    public void close() {}
}

public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door left = new Door(),
                right = new Door();
    public Car() {
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.engine.start();
        car.left.window.rolldown();
        car.wheels[0].inflate(72);
    }
}

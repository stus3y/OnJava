package com.OnJava.Chapter9.polymorphism;

class Grain {
    @Override
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain process() { return new Grain(); }
}

class WheatMill extends Mill {
    @Override Wheat process() {
        return new Wheat();
    }
}

public class CovariantReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain process = mill.process();
        System.out.println(process);
        WheatMill wheatMill = new WheatMill();
        Wheat process1 = wheatMill.process();
        System.out.println(process1);
    }
}

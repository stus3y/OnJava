package com.OnJava.Chapter4;

class Tank {
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank1.level = 9;
        tank2.level = 47;

//        same(tank1, tank2);
        different(tank1, tank2);
    }

    static void same(Tank tank1, Tank tank2) {
        print(tank1, tank2, 1);

        tank1 = tank2;
        print(tank1, tank2, 2);

        tank1.level = 27;
        print(tank1, tank2, 3);
    }

    static void different(Tank tank1, Tank tank2) {
        print(tank1, tank2, 1);

        tank1.level = tank2.level;
        print(tank1, tank2, 2);

        tank1.level = 27;
        print(tank1, tank2, 3);
    }

    static void print(Tank tank1, Tank tank2, int period) {
        System.out.println(period + ": "+ tank1.level + " tank2.level: " + tank2.level);
    }
}

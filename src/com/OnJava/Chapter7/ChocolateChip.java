package com.OnJava.Chapter7;

import com.OnJava.Chapter7.dessert.Cookie;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip Constructor");
    }

    public void chomp() {
//        bite();         # 无法访问包内的 void 方法
        bite(1);
    }

    public static void main(String[] args) {
        ChocolateChip chocolateChip = new ChocolateChip();
        chocolateChip.chomp();
    }
}

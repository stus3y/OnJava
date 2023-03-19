package com.OnJava.Chapter7;

import com.OnJava.Chapter7.dessert.Cookie;

public class Dinner {
    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        //cookie.bite();   # 无法访问
        cookie.eat();      // 可以访问
    }
}

package com.OnJava.Chapter19_Reflection;

class Building {}
class House extends Building {}

public class ClassCasts {
    public static void main(String[] args) {
        Building build = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(build);
        h = (House) build;
    }
}

package com.OnJava.Chapter8.Reuse;

class Villian {
    private String name;

    protected void setName(String name) {
        this.name = name;
    }

    Villian(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Villian name is " + name;
    }
}

public class Orc extends Villian{
    private int orcNumber;

    Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        super.setName(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc " + orcNumber + " : " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}

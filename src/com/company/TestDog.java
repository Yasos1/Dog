package com.company;

public class TestDog {
    public static void main(String[] args)
    {
        Dog d1 = new Dog ("Jack",3);
        Dog d2 = new Dog ("Mira",6);
        Dog d3 = new Dog ("Itachi", 1);
        d3.setAge(1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println();

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
package oop_s1.main.Animals;

import oop_s1.main.Interfaces.Goable;
import oop_s1.main.Interfaces.Swimable;


public class Cat extends Animal implements Goable, Swimable {
    public Cat(String name) {
        super.name = name;
    }

    @Override
    public double swim() {
        return 2;
    }

    @Override
    public double run() {
        return 5;
    }

}

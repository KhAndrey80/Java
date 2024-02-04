package oop_s1.main.Animals;

import oop_s1.main.Interfaces.Goable;
import oop_s1.main.Interfaces.Swimable;


public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name) {
        super.name = name;
    }

    @Override
    public double swim() {
        return 4;
    }

    @Override
    public double run() {
        return 10;
    }

}




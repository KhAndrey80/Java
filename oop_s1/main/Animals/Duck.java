package oop_s1.main.Animals;

import oop_s1.main.Interfaces.Flyable;
import oop_s1.main.Interfaces.Goable;
import oop_s1.main.Interfaces.Swimable;


public class Duck extends Animal implements Flyable, Goable, Swimable {
    public Duck(String name) {
        super.name = name;
    }

    @Override
    public double swim() {
        return 7;
    }

    @Override
    public double run() {
        return 2;
    }

    @Override
    public double fly() {
        return 20;
    }
}

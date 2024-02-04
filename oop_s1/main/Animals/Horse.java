package oop_s1.main.Animals;

import oop_s1.main.Interfaces.Goable;
import oop_s1.main.Interfaces.Swimable;


public class Horse extends Animal implements Goable, Swimable {
    public Horse(String name) {
        super.name = name;
    }

    @Override
    public double swim() {
        return 3;
    }

    @Override
    public double run() {
        return 20;
    }

}

package oop_s1.main.Staff;

import oop_s1.main.Illness;
import oop_s1.main.Animals.*;

import java.util.Map;
import java.util.Random;

public class Nurse extends Staff {

    public Nurse(String name, int birthYear) {
        super(name, birthYear);
    }

    private final Map<Integer, String> procedures = Map.of(1, "Укол", 2, "Лекарство", 3, "Бинтование");

    public void doProcedure(Animal patient) {
        Random r = new Random();
        int random = r.nextInt(procedures.size()) + 1;
        String d = procedures.get(random);
        System.out.println("Проведены процедуры: " + d);
    }
}

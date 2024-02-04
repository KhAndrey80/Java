package oop_s1.main.Staff;

import oop_s1.main.Illness;
import oop_s1.main.Animals.*;


import java.util.Map;
import java.util.Random;

public class Doctor extends Staff {


    public Doctor(String name, int birthYear) {
        super(name, birthYear);
    }

    private final Map<Integer, String> diagnoses = Map.of(1, "Вывих ноги", 2, "Отравление", 3, "Простуда");

    public void doDiagnose(Animal patient) {
        Random r = new Random();
        int random = r.nextInt(diagnoses.size()) + 1;
        String d = diagnoses.get(random);
        patient.setIllness(new Illness(d));
        System.out.println("Поставлен диагноз: " + d);;
    }
}
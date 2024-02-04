package oop_s1.main;

import oop_s1.main.Animals.*;
import oop_s1.main.Staff.*;

public class Main3 {

    public static void main(String[] args) {
// создаем экземпляр класса нашей клиники
        VeterinaryClinic clinic = new VeterinaryClinic();

// создаем экземпляры животных для нашей клиники
        Animal cat = new Cat("Барсик");
        Animal horse  = new Horse("Максимус");
        Animal duck = new Duck("Черный плащ");
        Animal dog = new Dog("Шарик");
// заполняем одно из полей класса clinic информацией о пациентах
        clinic.addPatient(cat);
        clinic.addPatient(horse);
        clinic.addPatient(duck);
        clinic.addPatient(dog);

        //1.Вывод списка пациентов (тип, имя, ГР, диагноз)
        clinic.getPatients();
        System.out.println("-------------------------------------------------------------");

        //2. Вывод списка пациентов с доп. информацией по движениям
        clinic.getProfiles();
        System.out.println("-------------------------------------------------------------");

        //фильтрация пациентов по способам передвижения
        clinic.getGoables();
        clinic.getFlyables();
        clinic.getSwimables();

        //выписка пациента и вывод нового списка пациентов клиники
        clinic.removePatient(dog);
        clinic.getPatients();

        System.out.println("-------------------------------------------------------------");
        //создаем экземпляры персонала для нашей клиники
        Nurse katy = new Nurse("Екатерина Петрова", 2000);
        Nurse elena = new Nurse("Елена Иванова", 1986);
        Doctor sergey = new Doctor("Сергей Сидоров", 1994);
        Doctor sonya = new Doctor("София Кузнецова", 1956);

        //заполняем одно из полей класса clinic информацией о персонале
        clinic.addPersonal(katy);
        clinic.addPersonal(sergey);
        clinic.addPersonal(sonya);
        clinic.addPersonal(elena);

        //вывод списка персонала
        clinic.getPersonal();

        //увольнение сотрудника
        clinic.removePersonal(sonya);
        clinic.getPersonal();

        //постановка диагноза доктором
        System.out.println(horse);
        sergey.doDiagnose(horse);
        System.out.println(horse);

        //проведение процедуры медсестрой
        katy.doProcedure(horse);
    }
}

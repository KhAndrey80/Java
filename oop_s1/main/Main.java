package oop_s1.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// import main.clients.*;

public class Main {
    public static void main(String[] args) {
        //Создаем экземпляр класса 
        Animal cat = new Cat("Барсик", new Owner("Андрей Владимирович"), LocalDate.of(2020, 10, 15), new Illness("Лишай"),  10.0);  //Создаём экземпляр класса
        
        // System.out.println(cat.getNickname());

        // cat.setIllness(new Illness("Здоров"));
        // System.out.println(cat.getIllness());

        // Animal tesAnimal = new Animal();

        // System.out.println(tesAnimal.getNickname());

        // cat.wakeUp(); Чтобы не менять порядок, сделали их приватными. 
        // cat.hunt(); И создали публичный класс LifeCycle.
        // cat.eat(); Поменять их уже нельзя.
        // cat.sleep();

        // cat.LifeCycle();
        // System.out.println(cat);

        // Cat catty = new Cat(); Проявление полиморфизма. Animal catty = new Cat() можно, наоборот нельзя.
        // Animal catty = new Cat();
        // Dog goodBoy = new Dog();

        // System.out.println(goodBoy.getType());
        // System.out.println(catty.getType());

        // System.out.println(catty);

        // List<Animal> animals = new ArrayList<Animal>();
        // animals.add(cat);
        // animals.add(goodBoy);
        // animals.add(catty); 

        // int i = 0;
        // for (Animal animal : animals){
        // System.out.println(i + "  " + animal);
        // i ++;
        // }
        
        Animal horse  = new Horse("Максимус", new Owner("Рапунцель"), LocalDate.of(2022, 10, 15), new Illness("Ранение"));
        Animal duck = new Duck("Черный плащ", new Owner("Дисней"), LocalDate.of(1990, 11, 15), new Illness("Шизофрения"));

        System.out.println();
        System.out.println("Кот");
        System.out.println(cat);
        cat.Activity();
        System.out.println();
        System.out.println("Утка");
        System.out.println(duck);
        duck.Activity();
        System.out.println();
        System.out.println("Лошадь");
        System.out.println(horse);
        horse.Activity();
        System.out.println();
}

}

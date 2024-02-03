package oop_s1.main;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<Goable> list = new ArrayList<Goable>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        list.add(cat);
        list.add(dog);
        System.out.println(list);

        Animal animal = new Animal(){ // Это анонимный класс (в фигурных скобках)
            @Override
            public void eat() {
                
            }
        };
}

} 
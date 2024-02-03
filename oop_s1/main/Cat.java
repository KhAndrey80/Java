package oop_s1.main;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable{

    Double discount;


   public Cat (String nickname, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickname, owner, birthDate, illness); //Сходи в родительский класс и вызови 4 параметра
        this.discount = discount; // Всегда!!! после аргументов super класса
    }

    public Cat(){
        super();
        this.discount = 10.0;
}
    public Double getdiscount(){
        return discount;
    }
    public void setdiscount(Double discount){
        this.discount = discount;
    }

        public void fly(){
        System.out.println(nickname + " не умеет летать ");
}

       public void swim(){
       System.out.println(nickname + " плохо плавает ");
}

    @Override
    public String toString(){
        return super.toString() + "Discount("+ discount + ")";    
}

    @Override
    public void eat() {
        System.out.println("Кошка поймала мышку и ест её");
    }

    @Override
    public void toGo(){
         System.out.println(nickname + " двигается ");
        }
}

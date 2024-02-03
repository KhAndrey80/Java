package oop_s1.main;

import java.time.LocalDate;

public class Horse extends Animal{
   public Horse (String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness); //Сходи в родительский класс и вызови 4 параметра
  
  }

  public Horse(){
    super();
}

        public void fly(){
    System.out.println(nickname + " не умеет летать ");
} 
@Override
public void eat() {
    System.out.println("Лошадь ест овес");
}
}
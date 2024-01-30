package oop_s1.main;

import java.time.LocalDate;

public class Dog extends Animal{
   public Dog (String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness); //Сходи в родительский класс и вызови 4 параметра
  
  }

  public Dog(){
    super();
}
      public void fly(){
      System.out.println(getType() + " не умеет летать ");
}


} 


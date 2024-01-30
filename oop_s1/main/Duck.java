package oop_s1.main;

import java.time.LocalDate;

public class Duck extends Animal{
   public Duck (String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness); //Сходи в родительский класс и вызови 4 параметра
  
  }

  public Duck(){
    super();
}

} 

package oop_s1.main;

import java.time.LocalDate;

public abstract class Animal {     //добавили абстракт
    
    protected String nickname; // protected значит он будет виден в самом классе и его наследниках
    
    protected Owner owner;

    protected LocalDate birthDate;

    protected Illness illness;

 //Это Конструктор класса Animal:
    public Animal(String nickname, Owner owner, LocalDate birthDate, Illness illness){
       
        this.nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness; 
    }
    

        public Animal(){

            this("Кличка", new Owner("Хозяин"), LocalDate.now(),new Illness("Болезнь"));
            // this.nickname = "Кличка"; Выше - более короткая запись
            // this.owner = new Owner("Хозяин");
            // this.birthDate = LocalDate.now();
            // this.illness = new Illness("Болезнь");
        }
    
        public String getNickname(){
            return nickname;
    }

        public Owner getOwner(){
            return owner;
    }
        private LocalDate getBirthDate(){
            return birthDate;
    }
        public Illness getIllness(){
            return illness;
    }
        public void setIllness (Illness illness){
            this.illness = illness;
}
        // public void LifeCycle(){
        //     wakeUp("12:00");
        //     hunt();
        //     eat();
        //     sleep();
        // }

    private void wakeUp(String time){ // можно убрать аргумент
        System.out.println("Животное " + nickname + " проснулось в " + time); // тогда и здесь time убрать
    }

    public String getType(){
        return getClass().getSimpleName();
    }


    protected void fly(){
        System.out.println(nickname + " летит ");
    }

    protected void swim(){
        System.out.println(nickname+ " плывет ");
    }
    public void Activity(){
        toGo();
        fly();
        swim();
    }
    
    private void hunt(){
        System.out.println("Животное охотится");
    }

    public abstract void eat();

    private void sleep(){
        System.out.println("Животное уснуло");
    }

    @Override
    public String toString() {
        return String.format("name: %s, owner: %s, bd: %s, illness : %s", nickname, owner, birthDate, illness);
    }

}


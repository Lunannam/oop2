package oop2;

public class Duck extends Animal implements Flyable, Runable, Speakable , Swimable{

    public Duck(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
        
    }


    @Override
    public String fly() {
       
        return "90 км ч";
    }


    @Override
    public String run() {
       
        return "10 км ч";
    }


    @Override
    public String speak() {
        
        return "Кря - кря";
    }


    @Override
    public String swim() {
        
        return "7 км ч";
    }
    
}

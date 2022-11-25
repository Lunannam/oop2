package oop2;

public class Turtle extends Animal implements Swimable{

    public Turtle(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
        
    }

    @Override
    public String swim() {
        
        return "9 км ч";
    }
    
}

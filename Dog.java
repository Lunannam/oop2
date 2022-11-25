package oop2;

public class Dog extends Animal implements Speakable, Runable{

    public Dog(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
     
    }
    @Override
    public String speak() {
              return "woof";
    }
    @Override
    public String run() {
        // TODO Auto-generated method stub
        return "50 км ч";
    }
    
}

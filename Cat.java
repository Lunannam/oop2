package oop2;

import java.io.IOException;
import java.nio.CharBuffer;

public class Cat extends Animal implements Speakable, Runable{
    public Cat(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);  
     
    }

    @Override
    public String speak() {
        
        return "Meow";
    }

    @Override
    public String run() {
        
        return "30 км ч";
    }

   




}

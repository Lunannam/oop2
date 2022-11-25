package oop2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Zoo {
    private List<Animal> animals ;
    private List<Animal> result;

    public Zoo() {
        animals = new ArrayList<Animal>(Arrays.asList(new Turtle("Эльза", "морская", "brown", 4,100), new Duck("Мотя", "обыкновенная", "серая", 2,3),
        new Fish("Дора", "клоун", "yellow", 0,1),
        new Cat("Барсик", "шотландский", "black", 4 ,3), 
        new Dog("Шарик", "дворовый", "red", 4,10)));
        
        
    }

    public void talk(){
        for (Speakable item : getSpeakable()) {
            System.out.printf("%s \n",item.speak());
        }
        //for (Animal item : animals) {
        //    System.out.printf("%s %s \n",item.getName(), get.speak());
        }

    
    
    public List<Speakable> getSpeakable(){
        List<Speakable> result = new ArrayList<>();
            for (Animal speakItem : animals) {
                if (speakItem instanceof Speakable) {
                    result.add((Speakable) speakItem);
                }     
        }
        result.add( new Radio());
        return result;
       }

       public List<Runable> getRunable(){
        List<Runable> result = new ArrayList<>();
        for (Animal runItem : animals) {
            if (runItem instanceof Runable) {
                result.add((Runable) runItem);
  
            }
            
        }
        return result;
       }

       public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal flyItem : animals) {
            if (flyItem instanceof Flyable) {
                result.add((Flyable) flyItem);
            }
            
        }
        return result;
       }

       public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal swimItem : animals) {
            if (swimItem instanceof Swimable) {
                result.add((Swimable) swimItem);
            }
            
        }
        return result;
       }

       public void run(){
        for (Runable item : getRunable()) {
            System.out.printf("%s,%s\n", item.toString(),  item.run());
        }
       }
       
       public void fly(){
        for (Flyable item : getFlyable()) {
            System.out.printf("%s,%s\n", item.toString(),  item.fly());
        }
       }

       public void swim(){
        for (Swimable item : getSwimable()) {
            System.out.printf("%s,%s\n", item.toString(),  item.swim());
        }
       }
    }



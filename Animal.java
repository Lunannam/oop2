package oop2;

public abstract class Animal {

/**
     * @param name
     * @param breed
     * @param colour
     * @param countLegs
     * @param age
     */
    public Animal(String name, String breed, String colour, Integer countLegs, Integer age) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.countLegs = countLegs;
        this.age = age;
    }
    // Реализовать абстрактный класс Animal и его наследники Cat, Dog, и прочее. 
// Родитель имеет в себе общие данные (пример: кличка, 
// количествор лап, какие звуки издают и тд), а наследники собственные 
// параметры (тип перемещения).
    protected String name;
    protected String breed;
    protected String colour;
    protected Integer countLegs;
    protected Integer age;

    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }
    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }
    /**
     * @return the countLegs
     */
    public Integer getCountLegs() {
        return countLegs;
    }
    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getName();
    }
}

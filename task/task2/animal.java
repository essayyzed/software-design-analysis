abstract class Animal {
    protected int legs;
    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("Animal walks with " + this.legs + " no. of legs");
    }

}

class Spider extends Animal {

    Spider() {
        super(8);
    }

    public void eat(){
        System.out.println("Spider eats insects");
    }
}

interface Pet {
    public void setName(String name_of_pet);
    public String getName();
    public void play();
}

class Cat extends Animal implements Pet {
    private String name_of_pet;

    public Cat(){
        this("");
    }

    public Cat(String name_of_pet) {
        super(4);
        this.name_of_pet = name_of_pet;
    }

    public void setName(String name_of_pet){
        this.name_of_pet = name_of_pet;
    }

    public String getName() {
        return name_of_pet;
    }

    public void eat() {
        System.out.println("Cat eats Fish");
    }

    public void play() {
        System.out.println("Unable to perform any");
    }

}


class Fish extends Animal implements {
    
    private String FishName;
    
    public Fish(){
        super(0);
    }


    public void eat() {
        System.out.println("Fish eat Herbs");
    }

    public String getName(){
        return FishName;
    }
    public void setName(String FishName){
        this.FishName = FishName;
    }

    public void play() {
        System.out.println("Operation cannot be performed");
    }
    
}

class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.setName("Shark");
        d.eat();
        System.out.println("This fish's name is " + d.getName());
        d.walk();

        c.eat();
        System.out.println("This fish's name is"+c.getName());
        c.walk();
    }
}
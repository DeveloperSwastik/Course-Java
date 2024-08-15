package module_8;

public class nAbstraction {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        Cat cat = new Cat("Pussy");

        System.out.println(dog.voice());
        System.out.println(cat.voice());
    }
}

abstract class Animal{
    String category;
    String name;

    public Animal(String category, String name){
        this.category = category;
        this.name = name;
    }

    abstract String voice();
}

class Dog extends Animal{
    public Dog(String name){
        super("Dog", name);
    }

    @Override
    String voice(){
        return ( " barks");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super("Cat", name);
    }

    @Override
    String voice(){
        return (this.name + " meow");
    }
}
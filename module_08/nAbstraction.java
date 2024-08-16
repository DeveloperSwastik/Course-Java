package module_08;

public class nAbstraction {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        Cat cat = new Cat("Pussy");

        System.out.println(dog.voice());
        System.out.println(cat.voice());
    }
}

abstract class Animals{
    String category;
    String name;

    public Animals(String category, String name){
        this.category = category;
        this.name = name;
    }

    abstract String voice();
}

class Dog extends Animals{
    public Dog(String name){
        super("Dog", name);
    }

    @Override
    String voice(){
        return ( " barks");
    }
}

class Cat extends Animals{
    public Cat(String name){
        super("Cat", name);
    }

    @Override
    String voice(){
        return (this.name + " meow");
    }
}
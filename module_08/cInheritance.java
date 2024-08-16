package module_08;

public class cInheritance {
    public static void main(String[] args) {
        Animal bird = new Animal("Bird", "Fairy");
        Dog dog = new Dog("Tommy");
        Cat cat = new Cat("Pussy");

        System.out.println(bird);
        System.out.println(dog);
        System.out.println(cat);
    }
}

class Animal{
    String category;
    String name;

    public Animal(String category, String name){
        this.category = category;
        this.name = name;
    }

    @Override
    public String toString(){
        return ("Category : " + this.category + "\nName : " + this.name);
    }
}

class Dog extends Animal{
    public Dog(String name){
        super("Dog", name);
    }
}

class Cat extends Animal{
    public Cat(String name){
        super("Cat", name);
    }
}
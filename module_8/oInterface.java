package module_8;

public class oInterface {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", "Tommy");
        Cat cat = new Cat("Cat", "Pussy");

        System.out.println(dog.voice());
        System.out.println(cat.voice());
    }
}

interface Animal{
    // String name; - NOt allowed
    String voice(); // --> public abstract String voice();
    
}

interface Animal2{
    
    String voice();
    
}

class Dog implements Animal, Animal2{
    String category;
    String name;

    public Dog(String category, String name){
        this.category = category;
        this.name = name;
    }

    @Override
    public String voice(){
        return (this.name + " barks");
    }
}

class Cat implements Animal{
    String category;
    String name;
    
    public Cat(String category, String name){
        this.category = category;
        this.name = name;
    }

    @Override
    public String voice(){
        return (this.name + " meow");
    }
}
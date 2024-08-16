package module_08;

public class oInterface {
    public static void main(String[] args) {
        Dogs dog = new Dogs("Dog", "Tommy");
        Cats cat = new Cats("Cat", "Pussy");

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

class Dogs implements Animal, Animal2{
    String category;
    String name;

    public Dogs(String category, String name){
        this.category = category;
        this.name = name;
    }

    @Override
    public String voice(){
        return (this.name + " barks");
    }
}

class Cats implements Animal{
    String category;
    String name;
    
    public Cats(String category, String name){
        this.category = category;
        this.name = name;
    }

    @Override
    public String voice(){
        return (this.name + " meow");
    }
}
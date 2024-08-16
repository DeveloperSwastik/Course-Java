package module_10;

public class bThrowThrows {
    public static void main(String[] args){
        try {
            Animal robin = new Animal("Human", "Robin");
            System.out.println(robin.category);
        } catch (InvalidCategoryException e) {
            System.out.println("Not Use any human category");
        }
        int[] arr = {1, 2};
        Add a = new Add(arr);
        System.out.println(a.output());
    }
}

class Add{
    int a;
    int b;

    public Add(int[] c) throws ArrayIndexOutOfBoundsException{
        this.a = c[0];
        this.b = c[1]; 
    }

    public int output(){
        return a + b;
    }
}

class Animal{
    String category;
    String name;

    public Animal(String category, String name) throws InvalidCategoryException{
        if (
            category.equals("Human") || 
            category.equals("human")
        ){
            throw new InvalidCategoryException("Humans are not animal.");
        }

        this.category = category;
        this.name = name;
    }
}

class InvalidCategoryException extends Exception{
    public InvalidCategoryException(String message){
        super(message);
    }
}
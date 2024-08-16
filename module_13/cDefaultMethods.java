package module_13;

public class cDefaultMethods {
    public static void main(String[] args) {
        Gen gen = new Gen();
        System.out.println(gen.cube(2));
    }
}

class Gen implements Power{
    @Override
    public int square(int number){
        return number*number;
    }

    @Override
    public int cube(int number){
        return number*number*number;
    }
}

@FunctionalInterface
interface Power{
    int square(int number);

    default int cube(int number){
        return number*number*number;
    }
}
package module_13;

public class dStaticMethods {
    public static void main(String[] args) {
        Gen2 gen = new Gen2();
        System.out.println(gen.square(2));
        System.out.println(Power.cube(2));
    }
}

class Gen2 implements Power{
    @Override
    public int square(int number){
        return number*number;
    }
}

@FunctionalInterface
interface Power{
    int square(int number);

    static int cube(int number){
        return number*number*number;
    }
}

package module_13;

public class aFunctionalInterface {
    public static void main(String[] args) {
        Square findSquare = (number) -> number*number;

        System.out.println(
            findSquare.square(12)
        );
    }
}

@FunctionalInterface
interface Square{
    int square(int number);
} 
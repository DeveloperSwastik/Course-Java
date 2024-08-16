package module_17;

public class cLamdaFunction {
    public static void main(String[] args) {
        Calculator calculate = (a, b) -> a + b;
        System.out.println(calculate.add(1, 3));
    }
}

@FunctionalInterface
interface Calculator{
    int add(int a, int b);
}
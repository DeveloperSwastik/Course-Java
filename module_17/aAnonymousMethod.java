package module_17;

public class aAnonymousMethod {
    public static void main(String[] args) {
        int sum = new Anonymous().add(2, 3);
        System.out.println(sum);
    }
}

class Anonymous{
    int add(int a, int b){
        return a + b;
    }
}
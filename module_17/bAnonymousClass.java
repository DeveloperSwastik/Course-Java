package module_17;

public class bAnonymousClass {
    public static void main(String[] args) {
        AnonymousInterface unknown = new AnonymousInterface() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        int sum = unknown.add(2, 3);
        System.out.println(sum);
    }
}

interface AnonymousInterface{
    int add(int a, int b);
}
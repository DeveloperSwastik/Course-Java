package module_16;

public class aNestedClasses {
    
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassA.ClassB b = a.new ClassB();
        ClassA.ClassB.ClassC c = b.new ClassC();

        System.out.println(a.A);
        System.out.println(b.B);
        System.out.println(c.C);
    }
}

class ClassA{
    int A = 1;

    class ClassB{
        int B = 2;

        class ClassC{
            int C = 3;
            
        }
    }
    ClassB B = new ClassB();
}
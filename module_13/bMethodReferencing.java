package module_13;

public class bMethodReferencing {
    
    public static int mul(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        MathFunction obj = new MathFunction();
        Calculate addition = obj::add; // Non static referencing 

        Calculate2 subtraction = Sub::new; // Constructor referencing

        Calculate multiplication = bMethodReferencing::mul;// Static Referencing

        System.out.println(addition.cal(1, 3));
        subtraction.cal(4, 3);
        System.out.println(multiplication.cal(1, 3));
    }
}

class MathFunction{
    public int add(int a, int b){
        return a+b;
    }
}

class Sub{
    public Sub(int a, int b){
        System.out.println(a-b);
    }
}

@FunctionalInterface
interface Calculate{
    int cal(int a, int b);
}

@FunctionalInterface
interface Calculate2{
    void cal(int a, int b);
}
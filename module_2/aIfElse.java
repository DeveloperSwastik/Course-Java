package module_2;

public class aIfElse {
    public static void main(String[] args) {
        int a = 1;
        if (a >= 18) {
            System.out.println("Eligible to Vote in India");
        }
        else if (a < 18) {
            System.out.println("Not eligible to Vote in India");
        }
        else{
            System.out.println("Enter a valid age");
        }
    }
}

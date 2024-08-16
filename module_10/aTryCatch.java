package module_10;

public class aTryCatch {
    public static void main(String[] args) {
        int[] list = new int[10];
        try{
            // int a = 10/10;
            // System.out.println(list[1]);
            int a = 10/0;
            System.out.println(list[21] + a);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("I am Finally");
        }
    }
}


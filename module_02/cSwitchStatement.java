package module_02;
public class cSwitchStatement {
    public static void main(String[] args) {
        int i = 1;

        switch (i) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
        
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}

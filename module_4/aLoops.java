package module_4;
public class aLoops {
    public static void main(String[] args) {
        int i;
        for(i = 0; i < 20; i++){
            System.out.println(i);
        }
        i = 0;
        while (i<20) {
            System.out.println(i);
            i++;
        }
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<20);

        int[] a = {1,2,4,5,6,7,8};
        for (int j : a) {
            System.out.println(j);
        }
    }
}

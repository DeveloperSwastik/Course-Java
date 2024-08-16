package module_03;

import java.util.Scanner;

public class aTakingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean var1 = sc.nextBoolean();
        byte var2 = sc.nextByte();     
        short var3 = sc.nextShort();      
        int var4 = sc.nextInt();        
        long var5 = sc.nextLong();       
        float var6 = sc.nextFloat();   
        double var7 = sc.nextDouble();
        char var8 = sc.next().charAt(0);
        sc.close();

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
    }
}

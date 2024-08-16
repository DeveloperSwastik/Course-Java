package module_06;
public class bString {
    public static void main(String[] args) {
        String name_1 = new String("Anuj");
        String name_2 = "Anuj";
        String name_3 = "Anuj";
        System.out.println(name_1 == name_2);
        System.out.println(name_2 == name_3);
        System.out.println(name_1.equals(name_3));
    }
}
package module_18;

public class bYieldKeyword {
    public static void main(String[] args) {
        String str = "A";

        int output = switch(str){
            case "A" -> {
                yield 1;
            }
            case "B" -> {
                yield 2;
            }
            case "C" -> {
                yield 3;
            }
            case "D" -> {
                yield 4;
            }
            default  -> {
                yield 0;
            }
        };

        System.out.println(output);
    }
}

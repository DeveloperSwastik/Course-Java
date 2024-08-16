package module_18;

public class aSwitchExpression {
    public static void main(String[] args) {
        String str = "A";

        int output = switch(str){
            case "A" -> 1;
            case "B" -> 2;
            case "C" -> 3;
            case "D" -> 4;
            case "E" -> 5;
            default  -> 0;
        };

        System.out.println(output);
    }
}

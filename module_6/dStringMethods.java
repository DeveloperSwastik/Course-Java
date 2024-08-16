package module_6;

public class dStringMethods {
    public static void main(String[] args) {
        String name_1 = new String("Run");
        
        // The compareTo() method compares two strings lexicographically.
        System.out.println(name_1.compareTo("Run")); // -> 0
        
        // Compares two strings lexicographically, ignoring case differences
        System.out.println(name_1.compareToIgnoreCase("run")); // -> 0
        
        // Returns the character at the specified index (position)
        System.out.println(name_1.charAt(0)); // -> R

        // Appends a string to the end of another string
        System.out.println(name_1.concat(" Fast")); // -> Run Fast

        // 	Checks whether a string contains a sequence of characters
        System.out.println(name_1.contains(" Fast")); // -> false

        // 	Checks whether a string contains the exact same sequence 
        //  of characters of the specified CharSequence or StringBuffer
        System.out.println(name_1.contentEquals("Run")); // -> true
        
        // 	Returns a String that represents the characters of the character array
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String name_2 = String.copyValueOf(myStr1, 0, 5);
        System.out.println(name_2); // -> Hello
        
        // Checks whether a string ends with the specified character(s)
        System.out.println(name_1.endsWith("n")); // -> true
        
    }
}
package module_08;

public class pEncapsulation {
    
    public static void main(String[] args) {
        Drinks magicMoments = new Drinks("Vodka", 38);
        Drinks absolut = new Drinks("Vodka", 40);
        // magicMoments.count;
        System.out.println(magicMoments.category + " " + absolut.category);
        System.out.println(Drinks.counts());
    }
}

class Drinks{
    private static int count; // within the class
    protected String category; // accessible within the same package or subclasses in different packages.
    int alcoholValue; //  only within the same package.
    
    public Drinks(String category, int alcoholValue){
        this.category = category;
        this.alcoholValue = alcoholValue;

        count++;
    }

    static int counts(){
        return count;
    }
}

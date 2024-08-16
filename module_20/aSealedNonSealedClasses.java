package module_20;

public class aSealedNonSealedClasses {
    public static void main(String[] args) {
        
    }
}

sealed class Animal permits Dog, Cat{
    String speak(String voice){
        return "Animal" + voice;
    }
}

non-sealed class Dog extends Animal{
    String speak(String voice){
        return "Dog" + voice;
    }
}

non-sealed class Cat extends Animal{
    String speak(String voice){
        return "Cat" + voice;
    }
}

// non-sealed class Cats extends Animal{
//     String speak(String voice){
//         return "Cat" + voice;
//     }
// }
package module_7;

public class aClass {

    public static void main(String[] args) {
        
        FourWheelers ghost = new FourWheelers();
      
        ghost.four_wheeler_type = "Car";
        ghost.company = "Rolls Royce";

        System.out.println(ghost);
        System.out.println(ghost.getDetails());
        
    }
}

class FourWheelers{
    String four_wheeler_type;
    String company;

    String getDetails(){
        return ("Type of four wheeler is " + this.four_wheeler_type + "\nCar name is "  + this.company);
    }
}
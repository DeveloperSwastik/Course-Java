package module_7;

public class bConstructor {
    public static void main(String[] args) {
        FourWheelers ghost = new FourWheelers("Car","Rolls Royce");
        // FourWheelers_2 ghost2 = new FourWheelers_2("Car","Rolls Royce");
        System.out.println(ghost.getDetails());
    }
}

class FourWheelers{
    String four_wheeler_type;
    String company;

    public FourWheelers(String type, String company){
        this.four_wheeler_type = type;
        this.company = company;
    }

    public String getDetails(){
        return ("Type of four wheeler is " + this.four_wheeler_type + "\nCar name is "  + this.company);
    }
}

class FourWheelers_2{
    String four_wheeler_type;
    String company;

    private FourWheelers_2(String type, String company){
        this.four_wheeler_type = type;
        this.company = company;
    }

    public String getDetails(){
        return ("Type of four wheeler is " + this.four_wheeler_type + "\nCar name is "  + this.company);
    }
}
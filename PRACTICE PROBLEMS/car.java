
public class car {
    private String colour;
    private int doors;
    

    
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public car(){

    }
    

  public class encapsulation{
    public static void main(String[] args) {
        car n=new car();
        car n1=new car();
        n.setColour("white");
        n1.setColour("yellow");
        n.setDoors(4);
        n1.setDoors(5);
        System.out.println("CAR COLOUR IS :"+n.getColour());
        System.out.println("CAR COLOUR IS :"+n1.getColour());
        System.out.println("CAR DOORS IS :"+n.getDoors());
        System.out.println("CAR DOORS IS :"+n1.getDoors());
        

    }


}
}


    


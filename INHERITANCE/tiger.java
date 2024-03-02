public class tiger extends animal {
    public tiger(String colour, String breed, String colour2) {
        super(colour, breed);
        colour = colour2;
    }


    public tiger(String colour) {
        this.colour = colour;
    }


    private String colour="yellow";
   

    public String getName() {
        return colour;
    }


    @Override
    public String toString() {
        return "tiger [colour=" + colour + "]";
    }


  


   

    
}

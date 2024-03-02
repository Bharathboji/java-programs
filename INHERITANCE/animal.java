public class animal {
    String colour;
    String breed;
    public animal(String colour, String breed) {
        this.colour = colour;
        this.breed = breed;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public String toString() {
        return "animal [colour=" + colour + ", breed=" + breed + "]";
    }

    public animal(){

    }


   
}

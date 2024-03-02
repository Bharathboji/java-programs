public class triangle implements shape,colour{

   
    @Override
    public void area(int a, int b) {
       int area=(1/2)*a*b;
       System.out.println("AREA OF TRIANGLE "+area);
        
    }

    @Override
    public void colour1(String colour) {
      System.out.println("TRIANGLE COLOUR IS "+colour);
      
    }

     
}
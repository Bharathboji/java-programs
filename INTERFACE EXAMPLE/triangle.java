public class triangle implements shape,colour{

   
    @Override
    public void area(int a, int b) {
       int area=a*b*1/2;
       System.out.println("AREA OF TRIANGLE "+area);
        
    }

    @Override
    public void colour1(String colour) {
      System.out.println("TRIANGLE COLOUR IS "+colour);
      
    }

     
}
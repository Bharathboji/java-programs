public class circle implements shape{

    @Override
    public void area(int a, int b) {
        
        int area= (int)Math.PI*a*a;
        System.out.println("AREA OF CIRCLE "+area);
        
    }
    
}
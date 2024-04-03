public class triangle extends shape {
    void area(int length,int breadth){
       int  area=(length*breadth*1/2);
        System.out.println("AREA OF THE TRIANGLE : "+area);
    }

    @Override
    void perimeter(int length,int width,int height) {
        int a=length+width+height;
        System.out.println("PERIMETER IS :" +a);
        
        
    }

    @Override
    void area(int side) {
        // TODO Auto-generated method stub
        
    }

    @Override
    void perimeter(int side) {
        // TODO Auto-generated method stub
        
    }
    
}

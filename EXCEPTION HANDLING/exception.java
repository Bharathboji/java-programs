

public class exception{
    public static void main(String[] args) {
        int sum=0;
        
        try{
           
            int[] d1={12,314,556};
        for(int i=0;i<4;i++){
        System.out.println(d1[i]);
        sum=sum+d1[i];
        }
        int a=10/0;
            
        System.out.println(a);
        
           
        }catch(ArithmeticException d){
            System.out.println("ArithmeticException occur" +d.getMessage());
           
        }catch(Exception d){
            System.out.println("exception occured"+d.getMessage());
            sum=-5;
        }
        finally{
            System.out.println(sum);
            
        }
    }

}
import java.util.Scanner;
public class largenumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        
        if(a>b && a>c){
            System.out.println("A IS BIGGER:");
        }
        else if(b>a && b>c){
            System.out.println("B IS BIGGER:");
        }
        else{
            System.out.println("C IS BIGGER:");
        }
        
    }
}

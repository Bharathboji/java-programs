import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER FIRST SUBJECT MARKS:");
        int name1=s.nextInt();
        System.out.println("ENTER SECOND SUBJECT MARKS:");
        int name2=s.nextInt();
        System.out.println("ENTER THIRD SUBJECT MARKS:");
         int name3=s.nextInt();
         int avg=(name1+name2+name3)/3;
         int total=avg;
          if(total<=100 && total>=90){
            System.out.println("avg marks is :"+total);
          }
            else if(total<90 && total>80){
                System.out.println("AVG MARKS IS :"+total);
            }
           
            
            




    }
}

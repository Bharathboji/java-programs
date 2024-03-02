import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    /**
     * @param args
     */
    public static void main(String[] args){
        ArrayList<String> names=new ArrayList<>();
        names.add("hai");
        names.add("hello");
        names.add("ajay");
        for(String name:names){
        System.out.println(name);
        }

    

         ArrayList<String> student=new ArrayList<String>(Arrays.asList("hi","hello","hie"));
         for(String student1:student)
         {
            System.out.println(student1);
         }
        }
    }

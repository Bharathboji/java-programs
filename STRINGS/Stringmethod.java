import java.util.*;
public class Stringmethod {
    public static void main(String[] args){
        String a="charan is a boy";
        // char[] b=a.toCharArray();
        // Arrays.sort(b);                                 //IN THIS CODE THERE IS A DIFFERENT STRING METHODS IN COMMENTS
        // for(char c:b)
        // System.out.println(c);
        for(String d:a.split(" ")){
           // System.out.println(d);
            if(d.length()%2!=0){
                System.out.println(d);
            }
        }
    }
}


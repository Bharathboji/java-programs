import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class EXAMPLE2 {
    public static void main(String[] args) {
        Queue<Integer> num=new PriorityQueue<>();
        num.add(2);
        num.add(3);
        num.add(4);
        for(Integer v:num)
        System.out.println(" "+v);

       //changing queue to arraylist
        ArrayList<Integer> b=new ArrayList<>(num);
        System.out.println(b);
        Collections.reverse(b);
        System.out.println(b);

       //changing arraylist to array
        Integer[] c=new Integer[b.size()];
        c=b.toArray(c);
        for(Integer d:c){
        System.out.println(d);
    }
    }
}

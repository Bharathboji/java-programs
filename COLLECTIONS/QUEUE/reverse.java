import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class reverse {
    public static void main(String[] args) {
        Queue<Integer> num=new PriorityQueue<>(Comparator.reverseOrder());
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(9);
        num.add(8);
        num.add(5);
        System.out.println(num);

        // while (!num.isEmpty()) {
        //     System.out.println(num.poll());
        // }
        
        String b;
        b=num.toString();
        System.out.println(b);
    }
}

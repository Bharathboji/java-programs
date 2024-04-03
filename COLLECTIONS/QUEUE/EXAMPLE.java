import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class EXAMPLE{
    public static void main(String[] args) {
        Queue<String> name=new PriorityQueue<>();
        name.add("charan");
        name.offer("vinay anna");
        System.out.println(name);
       System.out.println(name.contains("charan"));

      System.out.println(name.element());
      name.poll();
      System.out.println(name);

      name.clear();
      System.out.println(name);
      System.out.println(name.peek());

      try{
      System.out.println(name.element());
      }catch(Exception e){
        System.out.println(e);
      }

      name.add("boji");
      System.out.println(name);

        Queue<String> name1=new PriorityQueue<>();
        name1.add("boji");
        name1.offer("146");
        System.out.println(name1);

        Queue<String> name2=new PriorityQueue<>();
        name2.addAll(name);
        name2.addAll(name1);
        System.out.println(name2);

        name.add("lucky");
        System.out.println(name);
        System.out.println(name.contains("boji"));
    }
}
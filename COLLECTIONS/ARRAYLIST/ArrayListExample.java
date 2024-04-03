import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample{
    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] b={"charan","anna","lucky"};
        ArrayList<Integer> num=new ArrayList<>(Arrays.asList(10,300,40));
        ArrayList<String> c=new ArrayList<>(Arrays.asList(b));
        System.out.println(c);
        System.out.println(num);
        System.out.println(num.size());
        num.get(1);
        System.out.println(num);
        num.addLast(50);
        System.out.println(num);
        num.add(1,20 );
        System.out.println(num);
        num.addFirst(0);
        System.out.println(num);
        num.add(6, 60);
        System.out.println(num);
        num.remove(6);
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);
        Collections.reverse(num);
        Collections.sort(c);
        Collections.reverse(c);
        c.remove(String.valueOf("lucky"));
        System.out.println(c);
        System.out.println(c.size());
        System.out.println(num);
        List<String> name=new ArrayList<>(Arrays.asList());
        name.add("charan");
        name.add("sulli");
        System.out.println(name);
        name.addFirst("jaya");
        System.out.println(name);
        name.addAll(c);
        System.out.println(name);
     }
}
import java.util.HashMap;
import java.util.Set;

public class Shallowcopy {
    public static void main(String[] args) {
         HashMap<Integer, String> names=new HashMap<>();
        names.put(1, "OG");
        names.put(2, "REMO");
        names.put(3, "DON");
        System.out.println(names.containsKey(2));
        System.out.println(names);

        HashMap<Integer, String> names1=new HashMap<>();
        names1.put(4, "pawan");
        names1.put(5, "sk");
        names1.put(6, "arul");
        System.out.println(names1.containsValue("Sk"));
        System.out.println(names1);


        names.putAll(names1);
        
        HashMap<Integer, String> c=(HashMap)names.clone();
        System.out.println(c);

    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SET {
    public static void main(String[] args) {
          HashMap<Integer, String> names=new HashMap<>();
        names.put(1, "OG");
        names.put(2, "REMO");
        names.put(3, "DON");
        names.put(4, "OG");
        names.put(5, "REMO");
        names.put(4, "DON");
        System.out.println(names);

        String b=(String)names.get(3);
        System.out.println(b);
        //OR
        System.out.println(names.get(3));

        Set set=names.entrySet();
        System.out.println(set);

        Set key=names.keySet();
        System.out.println(key);
        //or
        System.out.println(names.keySet());

        System.out.println(names.values());

        for(Map.Entry x:names.entrySet()){
            System.out.println(x);
        }
    }
}

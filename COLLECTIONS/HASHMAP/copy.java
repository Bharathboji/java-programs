import java.util.HashMap;
import java.util.Map;

public class copy {
    public static void main(String[] args) {
        HashMap<Integer, String> names=new HashMap<>();
        names.put(1, "OG");
        names.put(2, "REMO");
        names.put(3, "DON");
        //names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());

        HashMap<Integer, String> names1=new HashMap<>();
        names1.put(4, "pawan");
        names1.put(5, "sk");
        names1.put(6, "arul");
        System.out.println(names1);

        names1.putAll(names);
        System.out.println(names1);
        for(Map.Entry v:names1.entrySet()){
            System.out.println(v.getKey()+ " "+v.getValue());
        }

    }
}

import java.util.HashMap;
import java.util.Map;

public class EXAMPLE{
    public static void main(String[] args) {
        HashMap<String , Integer> color=new HashMap<>();
        color.put("bharath", 1);
        color.put("lucky", 2);
        color.put("charan", 3);
        System.out.println(color.size());
        System.out.println(color.get("lucky"));
        color.put("jayanth", 4);
        System.out.println(color);
        color.remove("bharath");
        System.out.println(color);
        System.out.println(color.containsValue(3));
        for(Map.Entry q:color.entrySet()){
            System.out.println(q.getKey()+" "+q.getValue());
        }
    }
} 
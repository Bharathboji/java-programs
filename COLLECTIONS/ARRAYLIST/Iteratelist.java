import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Iteratelist {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("vcharan");
        names.add("lucky");
        for(String i:names){
            System.out.println(i);
        }
        System.out.println(names.get(0));
        names.add(1,"boji");
        System.out.println(names);
        names.set(1,"bharath");
        System.out.println(names);
        names.remove(1);
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);
        if(names.contains("lucky")){
            System.out.println("true");
             }
             else{
                System.out.println("false");
             }
    }
}

import java .util.*;
public class Comparelists {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("red");
        names.add("yellow");
        names.add("blue");
        names.add("green");
        List<String> a=names.subList(1, 3);
        System.out.println(a);

        ArrayList<String> color=new ArrayList<>();
        color.add("blue");
        color.add("pink");
        color.add("yellow");
        color.add("white");
        Collections.swap(color, 1, 2);
        System.out.println(color);

        ArrayList<String> name=new ArrayList<>();
        for(String b:names)
            name.add(color.contains(b)?"yes":"no");
            System.out.println(name);

        ArrayList<String> b=new ArrayList<>();
        b.addAll(names);
        b.addAll(color);
        System.out.println(b);

        ArrayList<String> cd=(ArrayList<String>)b.clone();
        
        System.out.println(cd);
     }
}

import java.util.LinkedList;
import java.util.*;
public class APPEND{
    public static void main(String[] args){
        LinkedList<String> names=new LinkedList<>();
        names.add("manu");
        names.add("vasu");
        names.add("charan");
        names.add("jay");
        names.add("love");
        System.out.println(names);
        names.remove(4);
        System.out.println(names);
        names.add(2,"vinay");
        System.out.println(names);
        names.addFirst("shajU");
        names.addLast("jayanth");
        names.offerFirst("LUKCY");
        System.out.println(names);
        Object d=names.getFirst();
        Object e=names.peekLast();
        System.out.println(d);
        System.out.println(e);
        
        LinkedList<String> name2=new LinkedList<>();
        name2.add("lucky");
        name2.add("boji");
        name2.add("priya");
        name2.add("bharath");
        name2.add("love3");
        System.out.println(name2);
        System.out.println("-------------");

        LinkedList<String> name3=new LinkedList<>();
        name3.addAll(names);
        name3.addAll(1,name2);
        System.out.println(name3);
        System.out.println("----------------");
        
        LinkedList<String> name4=new LinkedList<>();
        name4.add("remo");
        name4.add("don");
        name4.add("srikaram");
        name4.add("doctor");
        name4.add("miller");
        Iterator p=name4.listIterator(1);
        while (p.hasNext()) {
            System.out.println(p.next());
        }
        System.out.println("-----------");

        LinkedList<String> name5=new LinkedList<>();
        name5.add("baby");
        name5.add("mohan");
        name5.add("arul");
        name5.add("priya");
        name5.add("captian");
        Iterator q=name5.descendingIterator();
        while (q.hasNext()) {
            System.out.println(q.next());
        }
        System.out.println("-------------");
    } 
}
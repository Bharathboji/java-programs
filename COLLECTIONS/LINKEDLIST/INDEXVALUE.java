import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import javax.swing.text.html.parser.Element;

public class INDEXVALUE {
    public static void main(String[] args) {
          LinkedList<String> name5=new LinkedList<>();
        name5.add("baby");
        name5.add("mohan");
        name5.add("arul");
        name5.add("priya");
        name5.add("captian");
        //name5.removeFirst();
        //name5.removeLast();
        Collections.swap(name5, 0, 2);
        Collections.shuffle(name5);
        System.out.println(name5);
        for(int i=0;i<name5.size();i++){
            System.out.println("Element AT INDEX " +i+ " "+name5.get(i));
        }
    }
}

import java.sql.Array;
import java.util.ArrayDeque;

public class ARRAYDEQUEeg{
    public static void main(String[] args) {
        ArrayDeque<String> std=new ArrayDeque<>();
        std.add("charan");
        std.add("lucky");
        std.add("vinnay anna garu");
        std.addFirst("my love");
        std.addLast("priya");
        std.offer("sk");
        std.offerFirst("crush");
        std.offerLast("keerthi");
        System.out.println(std);
    }
}
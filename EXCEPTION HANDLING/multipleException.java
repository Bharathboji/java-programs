import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class multipleException {
     public static void main(String[] args) {
        try {
            List<Integer> score = new ArrayList<>(Arrays.asList(12,34,56,24));
            for (int i =0; i <4; i++) {
                System.out.println(score.get(i));
            }
            Integer value = 5 / 0;
            System.out.println(value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("List range error - Error Message="+e.getMessage());
//            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero - Error Message="+e.getMessage());
        }
        System.out.println("welcome");
        System.out.println("hi");
    }
}

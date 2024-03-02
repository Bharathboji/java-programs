
import java.util.Arrays;
public class secondlargestnum{
    public static void main(String[] args) {
        int[] a={12,34,67,34,2};
        int b=a.length;
        Arrays.sort(a);
        System.out.println("ARRAYS ELEMENTS ARE");
        for(int i=0;i<b;i++){
            System.out.print(a[i] +" ");
        }
        System.out.println("\nSECOND LARGEST NUM IS:" +a[b-2]);

    
    }
}



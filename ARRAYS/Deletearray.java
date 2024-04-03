import java.util.ArrayList;
import java.util.Arrays;

public class Deletearray {
    public static void main(String[] args) {
        int[] a={1,3,5,7,8,7,7};
       // int[] b=new int[a.length-1];          TO REMOVE ELEMENT USING NEW ARRAY
       ArrayList<Integer> q=new ArrayList<>();     //TO DELETE DUPLICATE ARRAY
       
        int c=7;
        for(int i=0,k=0;i<a.length;i++){
            if(a[i]!=c){                                   //if(i!=c)  index num deleted
               // b[k]=a[i];
               q.add(a[i]);
                k++;
            }
        }
        //System.out.println(Arrays.toString(b));
        System.out.println(q);
    }
}

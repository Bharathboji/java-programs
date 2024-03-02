public class reverseint {
    public static void main(String[] args) {
        int i=1234,sum=0,r;
        while(i!=0){
            r=i%10;
            sum=(sum*10)+r;
            i=i/10;
        }
        System.out.println("THE REVERSE IS:"+sum);

    }
}

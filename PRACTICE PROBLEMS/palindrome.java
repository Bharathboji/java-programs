public class palindrome {
    public static void main(String[] args) {
        int sum=0,temp,r;
        int i=424;
        temp=i;
        while(i!=0){
            r=i%10;
            sum=(sum*10)+r;
            i=i/10;}
            if(temp==sum){
                 System.out.println("IT IS PALINDROME:");
            }
            else{
                System.out.println("NOT PALINDROME:");
            }

        }
    }
    



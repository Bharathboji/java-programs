public class Insert {
    public static void main(String[] args) {
        String a="lucky";
        String b="";
        String c="charan";
        for(int i=0;i<=a.length();i++){
            b=b+a.charAt(i);


            int index =5;
            if(i==index){
                b=b+c;
                
                System.out.println(b);
            }
        }
    }
}

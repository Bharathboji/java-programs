
public class triangle {
    public static void main(String[] args) {
        int row=8;
        for(int i=0;i<row;i++){
            for(int j=row-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

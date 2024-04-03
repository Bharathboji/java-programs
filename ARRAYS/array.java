public class array {
    public static void main(String[] args) {
        int[] a={1,2,3};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        String[] names={"bharath","lucky"};
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        int[][] twodarray={{1,2},{3,4},{5,6}};
        for(int i=0;i<twodarray.length;i++){
            for(int j=0;j<twodarray[0].length;j++){
                System.out.print(twodarray[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }

    }
}

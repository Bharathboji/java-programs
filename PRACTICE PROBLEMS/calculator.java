
public class calculator {
    
public static Integer add(int a,int b){
        return a+b;

    }
    public static double add(double a,double b,double c){
        return a+b+c;

    }
    public static Integer add(int a,int b,int c,int d){
        return a+b+c+d;

    }
    public static double add(double a,double b,double c,double d,double e){
        return a+b+c+d+e;

    }

    
public class addition{
    public static void main(String[] args) {
        System.out.println("ADDITION OF TWO NUMBERS   :" +add(11,12));
        System.out.println("ADDITION OF THREE NUMBERS :" +add(11.3,12.4,24.5));
        System.out.println("ADDITION OF FOUR NUMBERS  :" +add(25,122,244,256));
        System.out.println("ADDITION OF FIVE NUMBERS  :" +add(123.3,123.4,241.5,24.6,256));

    }
}
}

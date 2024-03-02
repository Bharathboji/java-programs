public class inheritance{
    public static void main(String[] args){
        animal animal2=new animal("white", "puppy");
       dog d=new dog();
        d.food();
        System.out.println(animal2);
        d.sound();
        d.bark();
        tiger d2=new tiger("white","tree","yellow");
       System.out.println(d2);

       
    }
}
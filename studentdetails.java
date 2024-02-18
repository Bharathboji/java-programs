public class studentdetails {
    public static void main(String[] args) {
        student bharath=new student();
        bharath.id=2;
        bharath.name="lucky";
        bharath.classname="java";
        bharath.phone=456;
        System.out.println(bharath);
    


    student charan=new student();
        charan.id=3;
        charan.name="lucky";
        charan.classname="java";
        charan.phone=134;
        System.out.println(charan);


        student ajay=new student(1,"ajay","java",1123);

        System.out.println(ajay);
    }
}


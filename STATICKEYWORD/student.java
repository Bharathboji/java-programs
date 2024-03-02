public class student{
    static String college;
    String name;

    public student(){
        System.out.println("constructor called");
    }

    public static String getcollege(){
        return college;
    }
    public static void setcollege(String college){
      student.college=college;

    }
    public static void mystudent(){
        college="vmv";
        System.out.println("student method is called");

    }
    public void student(){
        name="ajay";
        System.out.println("student method is called");
    }

}
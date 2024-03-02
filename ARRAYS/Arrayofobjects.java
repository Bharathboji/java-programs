import java.util.ArrayList;
public class Arrayofobjects {
    public static void main(String[] args){
        ArrayList<student> studentlist=new ArrayList<>();
        student ajay=new student("ajay","java",108);
        student lucky=new student("lucky","py",103);
        student boji=new student("boji","aws",104);
        studentlist.add(ajay);
        studentlist.add(lucky);
        studentlist.add(boji);
        
        
        System.out.println(studentlist);

        student seena=new student("senna","mpc",143);
        System.out.println(seena);
        


    }

    
}

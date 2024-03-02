public class school{
    final static String classes="1st class";
    String student1name;
    String student2name;
    int id;
      public  String getclasses(){
        return classes;
      }
      

    public static String getClasses() {
        return classes;
    }
    public String getStudent1name() {
        return student1name;
    }
    public void setStudent1name(String student1name) {
        this.student1name = student1name;
    }
    public String getStudent2name() {
        return student2name;
    }
    public void setStudent2name(String student2name) {
        this.student2name = student2name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public school(){

    }

    
    public school(String student1name, String student2name, int id) {
        this.student1name = student1name;
        this.student2name = student2name;
        this.id = id;
    }


     public void printschooldetails(){
        System.out.println("student1name:" +student1name);
        System.out.println("student2name:" +student2name);
        System.out.println("id:"+id);
   }
   
    


}
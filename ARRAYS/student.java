public class student {
    String name;
    String classname;
    int id;
    public student(String name, String classname, int id) {
        this.name = name;
        this.classname = classname;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getClassname() {
        return classname;
    }
    public int getId() {
        return id;
    }
    public student(){
        
    }


    @Override
    public String toString() {
        return "student [name=" + name + ", classname=" + classname + ", id=" + id + "]";
    }


    
}

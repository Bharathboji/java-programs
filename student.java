public class student {
   Integer id;
   String name;
   String classname;
   Integer phone;

public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getClassname() {
    return classname;
}
public void setClassname(String classname) {
    this.classname = classname;
}
    


public student(Integer id, String name, String classname)
 {
    this.id = id;
    this.name = name;
    this.classname = classname;
}
public student(){

}
@Override
public String toString() {
    return "student [id=" + id + ", name=" + name + ", classname=" + classname + ", phone=" + phone + "]";
}
public student(Integer id, String name, String classname, Integer phone) {
    this.id = id;
    this.name = name;
    this.classname = classname;
    this.phone = phone;
}


}


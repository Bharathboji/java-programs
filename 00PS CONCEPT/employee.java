public class employee {
    String nmae;
     int id;
     String dept;

    public employee(String nmae, int id, String dept) {
        this.nmae = nmae;
        this.id = id;
        this.dept = dept;
    }
    public String getNmae() {
        return nmae;
    }
    public void setNmae(String nmae) {
        this.nmae = nmae;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    @Override
    public String toString() {
        return "employee [nmae=" + nmae + ", id=" + id + ", dept=" + dept + "]";
    }

     public  employee(){

     }
      


    
}

public class employeedetails{
    String name;
    int id;
    String address;
    
    
    

    public employeedetails(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }


    public employeedetails() {
        //TODO Auto-generated constructor stub
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "employeedetails [name=" + name + ", id=" + id + ", address=" + address + "]";
    }


    
      
    

}
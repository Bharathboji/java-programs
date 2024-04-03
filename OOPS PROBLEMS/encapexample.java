public class encapexample {
    private String name;
    private int age;
    private String country;

    public String getname(){
        return name;

    }
    public int getage(){
        return age;
    }
    public String getcountry(){
        return country;
    }

    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setcountry(String country){
        this.country=country;
    }


    public static void main(String[] args) {
        encapexample e2=new encapexample();
        e2.setname("lucky");
        e2.setage(45);
        e2.setcountry("austria");
        System.out.println(e2.name+" \n" +e2.age+" \n" +e2.country);
        
    }

}

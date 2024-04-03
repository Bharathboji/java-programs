public class person{
    private String name;
    int age;
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        person person1=new person("charan", 99);
        person person2=new person("vinay anna", 20);
        System.out.println("NAME IS:"+person1.getName());
        System.out.println("AGE IS :"+person1.getAge());
        System.out.println("NAME IS "+person2.getName()+ " AND HIS AGE IS "+person2.getAge());
    }

    
}
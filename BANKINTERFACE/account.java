public interface account{
    void deposite(int amount);
    void withdraw(int amount);
    void calculate(int amount);
    int interest(int interest); 

    default void avgbalance(int balance){
        System.out.println("AVG BALANCE IS "+balance);
    }
}
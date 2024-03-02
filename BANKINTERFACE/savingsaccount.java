public class savingsaccount implements account,staff{

    @Override
    public int interest(int interest) {
        
        return interest;
    }

    @Override
    public void calculate(int amount) {
        System.out.println("calculate amount "+amount);
       
    }

    @Override
    public void deposite(int amount) {
        System.out.println("deposite ammount"+amount);
                
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("withdraw amount:"+amount);


        
    }

    public void avalbalance(int balance){
        System.out.println("AVAILABLE BALANCE IS  "+balance);
    }

    @Override
    public void intereststaff(int interest) {
        System.out.println("staff interest :"+interest);
        
    }
    
}

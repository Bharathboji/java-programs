public class currentaccount implements account {

    @Override
    public void calculate(int amount) {
        System.out.println("current calculate:"+amount);
        
        
    }

    @Override
    public void deposite(int amount) {
        System.out.println("current deposite:"+amount);
       
        
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("current withdraw:"+amount);
       
        
    }

    @Override
    public int interest(int interest) {
        System.out.println("ghhk");
        
        return interest;
    }
    
}

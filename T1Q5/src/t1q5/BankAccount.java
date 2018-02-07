package t1q5;

/**
 *
 * @author Chin Jia Xiong
 */
public class BankAccount implements Account {
    int balance;
    
    public BankAccount(int b){
        balance = b;
    }
    
    @Override
    public int deposit(int b){
        balance += b;
        return balance;
    }
    
    @Override
    public boolean withdraw(int b){
        if(b<=balance){
            balance -= b;
            return true;
        }
        return false;
    }
    
}

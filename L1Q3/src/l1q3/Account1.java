package l1q3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chin Jia Xiong
 */
public class Account1 extends Account{
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList();
    
    public Account1(String name, int id, double balance, double rate){
        super(id, balance, rate);
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public ArrayList<Transaction> getTransactions(){
        return transactions;
    }
    
    @Override
    public void withdraw(double amnt){
        if(this.getBalance() > amnt){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter description for deposit : ");
            String desc = input.nextLine();
            this.setBalance(this.getBalance() - amnt);
            Transaction t = new Transaction('W', amnt, this.getBalance(), desc);
            transactions.add(t);
        }
        else{
            System.out.println("Not enough balance!");
        }
    }
    
    @Override
    public void deposit(double amnt){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter description for deposit : ");
        String desc = input.nextLine();    
        this.setBalance(this.getBalance() + amnt);
        Transaction t = new Transaction('D', amnt, this.getBalance(), desc);
        transactions.add(t);
    }
    
}

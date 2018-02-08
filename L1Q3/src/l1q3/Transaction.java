package l1q3;

import java.util.Date;

/**
 *
 * @author Chin Jia Xiong
 */
public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    public Transaction(char type, double amnt, double bal, String desc){
        this.type = type;
        amount = amnt;
        balance = bal;
        description = desc;
        date = new Date();
    }
    
    public Date getDate(){
        return date;
    }
    
   public char getType(){
       return type;
   }
   
   public void setType(char t){
       type = t;
   }
   
   public double getAmount(){
       return amount;
   }
   
   public void setAmount(double amnt){
       amount = amnt;
   }
   
   public double getBalance(){
       return balance;
   }
   
   public void setBalance(double bal){
       balance = bal;
   }
   
   public String getDescription(){
       return description;
   }
   
   public void setDescription(String desc){
       description = desc;
   }
   
}

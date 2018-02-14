package l1q3;

/**
 *
 * @author Chin Jia Xiong
 */
public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000, 4.5);
        acc.withdraw(2500);
        acc.deposit(2000);
        System.out.println(acc.getBalance());
        System.out.println(acc.getMonthlyInterest());
        System.out.println(acc.getDateCreated());
        System.out.println("!!SEPERATOR FOR QUESTION 4 ALERT!!");
        Account1 acc2 = new Account1("George", 1122, 1000, 1.5);
        acc2.deposit(30);
        acc2.deposit(40);
        acc2.deposit(50);
        acc2.withdraw(5);
        acc2.withdraw(4);
        acc2.withdraw(2);
        System.out.println("Account Summary");
        System.out.println(acc2.getName());
        System.out.println(acc2.getMonthlyInterestRate());
        System.out.println(acc2.getBalance());
        for(Transaction i: acc2.getTransactions()){
            System.out.println(i.getDate());
            System.out.println(i.getType());
            System.out.println(i.getAmount());
            System.out.println(i.getBalance());
            System.out.println(i.getDescription());
            System.out.println("--------------------");
        }
    }
}

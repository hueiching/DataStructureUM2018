package l3q2;

import java.util.Arrays;

/**
 *
 * @author Chin Jia Xiong
 */
public class L3Q2 {
    
    static long[] rslt = new long[9999];

    public static void main(String[] args) {
//        rslt[0] = (long)1;
//        rslt[1] = (long)1;
//        long old = System.currentTimeMillis();
//        for (int i=0;i<1000000000;i++) fact(20);
//        long newi = System.currentTimeMillis() - old;
//        System.out.println("For fast fact: " + newi);
//        long old2 = System.currentTimeMillis();
//        for(int i=0; i<1000000000; i++) slowFact(20);
//        long newi2 = System.currentTimeMillis() - old2;
//        System.out.println("For slow fact: " + newi2);
        printBinomial(3);
    }
    
    public static void printBinomial(int power, int total){
        if(power!=-1){
            System.out.print(comb(total, total-power) + "x^" + power + "y^" + (total-power));
            if(power != 0) System.out.print(" + ");
            else System.out.println(".");
            printBinomial(power-1, total);
        }
    }
    
    public static void printBinomial(int power){
        printBinomial(power, power);
    }
    
    public static long comb(int n, int r){
        return fact(n) / (fact(n-r)*fact(r));
    }
    
    public static long fact(int n){
        if(rslt[n] == 0){  // n = 5  [0,0,0,0]
            rslt[n] = n * fact(n-1);
            return fact(n);
        }
        else {
            return rslt[n];
        }
    }
    
    public static long slowFact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*slowFact(n-1);
        }
    }

}


package l1q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Chin Jia Xiong
 */
public class L1Q2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("text1.txt"));
        String text;
        int counter = 0;
        while((text = br.readLine())!=null && !text.isEmpty()){
            for(int i=0; i<text.length(); i++){
                char tmp = text.charAt(i);
                if(!(tmp<48 || (tmp>57&&tmp<65) || (tmp>90&&tmp<97)|| tmp>122)){
                    System.out.print(tmp);
                    counter++;
                }
            }
            System.out.println("");
        }
        System.out.println("The number of characters retrieved is : " + counter);
    }
}

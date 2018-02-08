package l1q1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chin Jia Xiong
 */
public class L1Q1 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("ChinJiaXiong_WIF170029.txt"));
            String text;
            while((text=br.readLine())!=null && !text.isEmpty()){
                System.out.println(text);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(L1Q1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(L1Q1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

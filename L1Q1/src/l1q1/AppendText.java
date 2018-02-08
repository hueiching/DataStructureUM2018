package l1q1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chin Jia Xiong
 */
public class AppendText {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File("ChinJiaXiong_WIF170029.txt"), true));
            Scanner input = new Scanner(System.in);
            pw.println();
            pw.println();
            pw.println();
            pw.println("Thursday, 10 May 2018");
            pw.println();
            pw.println();
            pw.println("It's me again. Finally, it's the end of the term and the DS class has finished! ");
            System.out.println("How you have performed in the class?");
            pw.println(input.nextLine());
            System.out.println("Are you happy with your performanace?");
            pw.println(input.nextLine());
            System.out.println("What has learning DS taught you / what did you learn from DS?");
            pw.println(input.nextLine());
            System.out.println("Is there any change to your target grade?");
            pw.println(input.nextLine());
            System.out.println("What you did well during the course?");
            pw.println(input.nextLine());
            System.out.println("What could have been done better during the course?");
            pw.println(input.nextLine());
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(AppendText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

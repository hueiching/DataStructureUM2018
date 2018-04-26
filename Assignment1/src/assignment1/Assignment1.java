package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Chin Jia Xiong
 */
public class Assignment1 {

    public static void main(String[] args) throws IOException {
        Lift lift = new Lift();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        for(int i=0; i<cases; i++){
            lift.addRequest();
        }
        Request crtReq;
        while((crtReq = lift.requests.poll()) != null){
            lift.processRequest(crtReq);
        }
        lift.displayDetails();
    }
    
}

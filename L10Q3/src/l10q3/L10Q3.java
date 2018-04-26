package l10q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 *
 * @author Chin Jia Xiong
 */
public class L10Q3 {

    public static void main(String[] args) throws IOException {
        LinkedList<Integer> shares = new LinkedList<>();
        LinkedList<Integer> prices = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int profit = 0;
        while(true){
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String text;
            if((text = br.readLine()) == null || text.isEmpty()) break;
            StringTokenizer st = new StringTokenizer(text);
            String instruction = st.nextToken();
            int share = Integer.parseInt(st.nextToken());
            st.nextToken();st.nextToken();
            int price = Integer.parseInt(st.nextToken().substring(1));
            if(instruction.equals("Buy")){
                System.out.println("Buying now...");
                shares.add(share);
                prices.add(price);
                System.out.println("Queue for Share: Queue: " + shares);
                System.out.println("Queue for Price: Queue: " + prices);
            }
            else{
                System.out.println("Selling the shares now...");
                int cost = 0, shareTouched = 0, earn = 0;
                while(shareTouched < share && !shares.isEmpty()){
                    if(shares.peek() <= (share - shareTouched)){
                        shareTouched += shares.peek();
                        earn += (shares.peek() * price);
                        cost += (shares.removeFirst() * prices.removeFirst());
                    }
                    else{
                        earn += ((share - shareTouched) * price);
                        cost += ((share - shareTouched) * prices.peek());
                        // update the queue
                        shares.set(0, shares.get(0) - (share - shareTouched));
                        break;
                    }
                }
                profit += (earn - cost);
                System.out.println("Total Capital Gain / Loss: " + profit);
                if(earn == 0) System.out.println("No shares to sell!");
                System.out.println("Queue for Share: Queue: " + shares);
                System.out.println("Queue for Price: Queue: " + prices);
            }
        }
        System.out.println("Final Capital Gain / Loss: " + profit);
    }
    
}

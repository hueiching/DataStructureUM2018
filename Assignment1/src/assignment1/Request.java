package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Chin Jia Xiong
 */
public class Request implements Comparable<Request> {
    int id, time, src, dest;
    
    public Request(int i, int t, int s, int d){
        id = i;
        time = t;
        src = s;
        dest = d;
    }

    @Override
    public int compareTo(Request t) {
        if(time > t.time) return 1;
        if(time == t.time) return 0;
        return -1;
    }
    
    public static Request inputRequest() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int j=0; j<4; j++) arr[j] = Integer.parseInt(st.nextToken());
        Request req = new Request(arr[0], arr[1], arr[2], arr[3]);
        return req;
    }
}

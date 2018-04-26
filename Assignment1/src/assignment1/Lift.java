package assignment1;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Chin Jia Xiong
 */
public class Lift {
    
    int capacity, currentTime, currentFloor, direction;
    Queue<Request> requests;
    Queue<Details> details;
    
    public Lift(){
        capacity = 30;
        direction = 0;
        currentTime = 0;
        currentFloor = 0;
        requests = new PriorityQueue<>();
        details = new PriorityQueue<>();
    }
    
    public void addRequest() throws IOException{
        requests.add(Request.inputRequest());
    }
    
    public void processRequest(Request req){
        details.add(new Details(req.time, "Service request (Request ID: " + req.id + ") received from floor " + req.src + " to floor " + req.dest));
        if(currentTime < req.time) currentTime = req.time;
        if(currentFloor != req.src){
            details.add(new Details(currentTime, "Heading to floor " + req.src));
            currentTime += Math.abs(currentFloor - req.src);
            currentFloor = req.src;
            details.add(new Details(currentTime, "Reached floor " + req.src));
        }
        details.add(new Details(currentTime, "Door opening"));
        currentTime += 5;
        details.add(new Details(currentTime, "Door opened"));
        currentTime += 4;
        details.add(new Details(currentTime, "1 passenger(s) entered the elevator"));
        details.add(new Details(currentTime, "Door closing"));
        currentTime += 5;
        details.add(new Details(currentTime, "Door closed"));
        details.add(new Details(currentTime, "Heading to floor " + req.dest));
        currentTime += Math.abs(currentFloor - req.dest);
        details.add(new Details(currentTime, "Reached floor " + req.dest));
        details.add(new Details(currentTime, "Door opening"));
        currentTime += 5;
        details.add(new Details(currentTime, "Door opened"));
        currentTime += 4;
        details.add(new Details(currentTime, "1 passenger(s) left the elevator"));
        details.add(new Details(currentTime, "Door closing"));
        currentTime += 5;
        details.add(new Details(currentTime, "Door closed"));
    }
    
    public void displayDetails(){
        Details d;
        while((d = details.poll()) != null){
            System.out.println(d.time + ": " + d.details);
        }
    }
}

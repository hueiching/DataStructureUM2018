package t1q4;

/**
 *
 * @author Chin Jia Xiong
 */
public abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed;
    
    public Vehicle(double s){
        maxSpeed = s;
    }
    
    public abstract void accelerate();
    
    public double getCurrentSpeed(){
        return currentSpeed;
    }
    
    public double getMaxSpeed(){
        return maxSpeed;
    }
    
    public void pedalToTheMetal(){
        while(currentSpeed < maxSpeed){
            accelerate();
        }
    }
    
    // We can't create an instance of Vehicle.
}

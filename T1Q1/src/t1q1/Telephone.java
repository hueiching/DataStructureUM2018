package t1q1;

/**
 *
 * @author Chin Jia Xiong
 */
public class Telephone {
    String areaCode;
    String number;
    static int numberOfTelephoneObject = 0;
    
    public Telephone(String a, String n){
        areaCode = a;
        number = n;
        numberOfTelephoneObject += 1;
    }
    
    public String getAreaCode(){
        return areaCode;
    }
    
    public void setAreaCode(String a){
        areaCode = a;
    } 
    
    public String getNumber(){
        return number;
    }
    
    public void setNumber(String n){
        number = n;
    }
    
    public String makeFullNumber(){
        return areaCode + "-" + number;
    }
    
}

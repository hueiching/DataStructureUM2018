package l7q2;

import java.util.Scanner;

/**
 *
 * @author Chin Jia Xiong
 */
public class Tester {
    public static void main(String[] args) {
        MyLinkedList<String> ls = new MyLinkedList<>();
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("Enter your student name list. Enter 'n' to end......");
        while(!(text = input.nextLine()).equals("n")){
            ls.add(text);
        }
        System.out.println("\nYou have enter the following students' name:");
        ls.printList();
        System.out.println("\nThe number of students entered is: " + ls.getSize());
        System.out.println("\nAll the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        String request = input.nextLine();
        if(request.equals("r")){
            System.out.println("\nEnter the existing student name that u want to rename: ");
            String name = input.nextLine();
            System.out.println("\nEnter the new name:");
            String newName = input.nextLine();
            ls.replace(name, newName);
            
            System.out.println("\nThe new student list is:");
            ls.printList();
        }
        System.out.println("\nDo you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        request = input.nextLine();
        if(request.equals("y")){
            System.out.println("\bEnter a student name to remove:");
            String nameToRemove = input.nextLine();
            int tmp = ls.getSize();
            ls.removeElement(nameToRemove);
            if(tmp == ls.getSize()){
                System.out.println("No update lehh");
            }
            else{
                System.out.println("\nThe number of updated student is: " + ls.getSize());
                System.out.println("The updated students list is: ");
                ls.printList();
            }
        }
        System.out.println("\nAll student data captured complete. Thank you!");
    }
}

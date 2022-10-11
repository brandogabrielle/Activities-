package pkg4thqtritj;
import java.util.Scanner;
public class InputOutput2 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int x1;
         double x2; 
         char x3;
         System.out.print("Input and integer: ");
         x1 = sc.nextInt();
         System.out.println("Value inputted for an int: " +x1);
         System.out.print("Input a double: ");
         x2 =sc. nextDouble();
         System.out.println("Value inputted for a double: " +x2);
         System.out.println("Input a character: ");
         x3 = sc.next(). charAt(0);
         // charAt(0) - gets the 1st character from a String
         System.out.println("Value inputted for a char: "+x3);
    }
}

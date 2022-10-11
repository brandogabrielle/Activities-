package pkg4thqtritj;
import java.io.*;
public class InputOutput1 {
    public static void main(String[] args) throws Exception{
        BufferedReader input=
        new BufferedReader(new InputStreamReader(System.in));
        //to accept a User input
        int x1;
        double x2; 
        char x3;
        System.out.print("Input and integer: ");
        x1 = Integer.parseInt(input.readLine());
        System.out.println("Value inputted for an int: " +x1);
      
        System.out.print("Input a double: ");
        x2 = Double.parseDouble(input.readLine());
         System.out.println("Value inputted for a double: " +x2);
        // readline method accepts a string
        //Double.parseDouble- converts a String to a double
        
        System.out.println("Input a character: ");
        x3 = input.readLine(). charAt (0);
        // charAt (0) - gets the 1st character from a string
        System.out.println("Value inputted for a char: "+x3);
    }
}
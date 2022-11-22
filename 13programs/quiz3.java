package thirteenprograms;
import java.util.Scanner;
public class ExC2 {
    public static void main(String[] args){            
    Scanner sc=new Scanner(System.in);
    String name, violation, plateno;
      System.out.println("ENTER NAME: ");
        name= sc.nextLine();
        System.out.println("ENTER PLATE NO.: ");
        plateno= sc.nextLine().toUpperCase();
        System.out.println("Speeding- SP ");
        System.out.println("Running Red Light - RRL");
        System.out.println("Drunk Driving- DD");
        System.out.println("Reckless Driving - RD");
        System.out.println("ENTER VIOLATION: ");
        violation= sc.nextLine().toUpperCase();
        
        
        
        switch(violation){
            case"SP": violation="Speeding= 500";
            break;
            case"RRL":violation="Running Red Light = 1000";
            break;
            case"DD":violation="Drunk Driving = 1500";
            break;
            case"RD":violation="Reckless Driving = 2000";
            break;
            default:System.out.println("INVALID VIOLATION!");
            break;
        }
        System.out.println("DRIVER'S NAME: "+ name+ "PLATE No.: "+plateno+" VIOLATION: "+violation );
    
    }
}

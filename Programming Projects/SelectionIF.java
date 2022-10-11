package pkg4thqtritj;
import java.util.Scanner;
public class SelectionIF {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double g1, g2, g3, ave; 
                 System.out.print("Input grade1: ");
         g1= sc.nextDouble();
                System.out.print("Input grade2: ");
         g2= sc.nextDouble();
                 System.out.print("Input grade3: ");
         g3= sc.nextDouble();
         
        ave = (g1+g2+g3) /3;
        
        System.out.println("The average grade is:  "+ave );
        if (ave >= 97 && ave <=100) {
            System.out.println("Your equivalent grade is 1.00 - Excellent");
        }
                else if (ave >=94 ){
            System.out.println("Your equivalent grade is 1.25- Excellent");
        }
        else if (ave >=91 ){
            System.out.println("Your equivalent grade is 1.50- Excellent");
        }
         else if (ave >=88 ){
         System.out.println("Your equivalent grade is 1.75- Above average");
         }
        else if (ave >=85 ){
         System.out.println("Your equivalent grade is 2.00- Above average");
         }
        else if (ave >=83 ){
         System.out.println("Your equivalent grade is 2.25- Above average");
         }
         else if (ave >=80 ){
         System.out.println("Your equivalent grade is 2.50- Above average");
         }        
        else if (ave >=77 ){
         System.out.println("Your equivalent grade is 2.75- Average");
         }  
        else if (ave >=75 ){
         System.out.println("Your equivalent grade is 3.00- Average");
         }  
        else if (ave >=50 ){
         System.out.println("Your equivalent grade is 5.00");
         }  
        else {
            System.out.println("This is an INVALID GRADE");
        }
        String name; 
        System.out.println("Enter the name of your pet: ");
        name= sc.next();
        if  (name.equals("Dog")){
            System.out.println("Ruff.. Ruff");
        }
        else if (name.equals("Cat")){
            System.out.println("Meow... meow");
        }
        else if (name.equals("Bird")){
            System.out.println("Tweet... tweet");
        }
        else{
            System.out.println("I do not know that animal.");
        }
    }
}
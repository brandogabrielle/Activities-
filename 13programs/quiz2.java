
package thirteenprograms;

import java.util.Scanner;

public class ExB {
    public static void main (String[] args){
         Scanner sc=new Scanner(System.in);
         String name;
         int age, rpd; 
         double dr, tb; 
         
         System.out.println("Name: ");
         name= sc.nextLine();
         System.out.println("Age: ");
         age=sc.nextInt();
         System.out.println("Amount rate per day: ");
         rpd= sc.nextInt();
         
         if(age<50){
             dr = rpd * 0.1;
             tb = rpd-dr;
             System.out.println("Name: "+name);
             System.out.println("Age: "+age);
             System.out.println("Total bill: "+tb);
         }
        else if(age<60){
             dr = rpd * 0.15;
             tb = rpd-dr;
             System.out.println("Name: "+name);
             System.out.println("Age: "+age);
             System.out.println("Total bill: "+tb);
         }
          else if(age<70){
             dr = rpd * 0.2;
             tb = rpd-dr;
             System.out.println("Name: "+name);
             System.out.println("Age: "+age);
             System.out.println("Total bill: "+tb);
         }
          else{
              System.out.println("Name: "+name);
             System.out.println("Age: "+age);
             System.out.println("Total bill: "+rpd);
             System.out.println("Sorry you have not been granted a discount rate :( ");
          }
    }
}

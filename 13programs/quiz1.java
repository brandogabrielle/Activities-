package thirteenprograms;

import java.util.Scanner;

public class ExA {
    public static void main (String[] args){
         Scanner sc=new Scanner(System.in);
         int grade, income;
         System.out.println("Enter grade: ");
         grade= sc.nextInt();
         System.out.println("Enter your Parent's income per month: ");
         income= sc.nextInt();
         
         if(grade >=78 && income <=10000){
             System.out.println("You're applicable for a scholarship <3");
         }
         else{
             System.out.println("You are not applicable for a scholarship");
         }
    }
}

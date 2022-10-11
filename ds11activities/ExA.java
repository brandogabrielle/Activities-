
package ds11activities;
import java.util.Scanner;
public class ExA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int grade, income;
        System.out.println("Enter Grade: ");
        grade= sc.nextInt();
        System.out.println("Enter your Parent's Income per month: ");
        income=sc.nextInt();
        
        if (grade>=78 && income<=10000){
            System.out.println("You're applicable for a scholarship");
        }
        else{
            System.out.println("You are not applicable for a scholarship");
        }
    }
}

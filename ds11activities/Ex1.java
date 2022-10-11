
package ds11activities;
import java.util.Scanner;
public class Ex1 {
       public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
        int grade;
           System.out.println("Enter grade: ");
           grade= sc.nextInt();
           if(grade>82){
               System.out.println("PASSING");
           }
           else{
               System.out.println("NOT PASSING");
           }
           
    }
}

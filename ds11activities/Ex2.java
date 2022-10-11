
package ds11activities;
import java.util.Scanner;
public class Ex2 {
     public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
           int num;
           System.out.println("ENTER A NUMBER: ");
           num= sc.nextInt();
           
           if(num%2==0){
               System.out.println("EVEN");
           }
           else{
               System.out.println("ODD");
           }
       
     }
     
}

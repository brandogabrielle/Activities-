
package thirteenprograms;
import java.util.Scanner;
public class Ex3 {
    public static void main (String[] args){
         Scanner sc=new Scanner(System.in);
         int grade;
         
         System.out.println("ENTER GRADE: ");
         grade= sc.nextInt();
         
         if(grade>100){
             System.out.println("INVALID GRADE!");
         }
         else if (grade >=90){
             System.out.println("GRADE: A");
         }
         else if (grade >=80){
             System.out.println("GRADE: B");
         }
         else if (grade >=70){
             System.out.println("GRADE: C");
         }
         else if (grade >=60){
             System.out.println("GRADE: D");
         }
         else if (grade<60){
             System.out.println("GRADE: F");
         }
         else {
             System.out.println("INVALID GRADE!");
         }
         
    }
}

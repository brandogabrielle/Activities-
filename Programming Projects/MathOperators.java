package pkg4thqtritj;
import java.util.Scanner;
public class MathOperators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1, num2, ans; 
        System.out.print("Enter an integer:");
        num1= sc.nextInt(); // to accept an int input
        System.out.print("Enter another integer:");
        num2 = sc.nextInt();
                  ans = num1+ num2;
        System.out.println(" The sum of "+num1+"  +  "+num2+" = "+ ans);
                  ans = num1- num2;
         System.out.println(" The difference of "+num1+"  -  "+num2+" = "+ ans);
                   ans = num1 *num2;
        System.out.println(" The product of "+num1+"  *  "+num2+" = "+ ans);
                   ans = num1 / num2;
        System.out.println(" The quotient of "+num1+"  /  "+num2+" = "+ ans);
                  ans = num1 % num2;
        System.out.println(" The remainder of "+num1+"  / "+num2+" = "+ ans);
    }
}

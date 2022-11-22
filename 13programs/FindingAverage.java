package thirteenprograms;
import java.util.Scanner;
public class FindingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        float ave;
        System.out.println("Finding grade average");
        System.out.println("Math: ");
        a = sc.nextInt();
        System.out.println("English: ");
        b = sc.nextInt();
        System.out.println("Programming: ");
        c = sc.nextInt();
        
        ave = (a+b+c)/3; 
        System.out.println("General average is: "+ave);
    }  
}

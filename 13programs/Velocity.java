package Activities;
import java.util.Scanner;
public class Velocity {
    public static void main(String[] args){
           Scanner sc= new Scanner(System.in);
           int d1,d2,t1,t2;
           
           System.out.println("Enter d1: ");
           d1= sc.nextInt();
           System.out.println("Enter d2: ");
           d2= sc.nextInt();
           System.out.println("Enter t1: ");
           t1= sc.nextInt();
           System.out.println("Enter t2: ");
           t2= sc.nextInt();
           
           int poscha=d2-d1;
           int timecha= t2-t1;
           float velo= poscha/timecha;
           System.out.println("Velocity= "+velo);
           
    }
}

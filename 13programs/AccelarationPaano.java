package thirteenprograms;
import java.util.Scanner;
public class AccelarationPaano {
    public static void main(String[] args){
           Scanner sc= new Scanner(System.in);
           int v1, v2, t;
           System.out.println("Enter v1: ");
           v1 = sc.nextInt();
           System.out.println("Enter v2: ");
           v2 = sc.nextInt();
           System.out.println("Enter time:");
           t= sc.nextInt();
           
           int change= v2-v1;
           int acc= change/t;
           System.out.println("Accelaration is= "+acc);
    }
}

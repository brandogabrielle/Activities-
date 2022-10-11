package pkg4thqtritj;
import java.util.Scanner;
public class Factorial_Paano {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1;
                System.out.println("Enter an Integer [1-9]: ");
        num1 = sc.nextInt();
                switch (num1){
            case 1: System.out.println("1! = 1"); break;
            case 2: System.out.println("2!= 2*1 = 2"); break;
            case 3: System.out.println("3!= 3*2*1 = 6"); break;
            case 4: System.out.println("4!= 4*3*2*1 =24 "); break;
            case 5: System.out.println("5!= 5*4*3*2*1 = 120"); break;
            case 6: System.out.println("6!= 6*5*4*3*2*1 = 720"); break;
            case 7: System.out.println("7!= 7*6*5*4*3*2*1 = 5,040"); break;
            case 8: System.out.println("8!= 8*7*6*5*4*3*2*1 = 40,320"); break;
            case 9: System.out.println("9!= 9*8*7*6*5*4*3*2*1 = 362,880"); break;
            default:
            System.out.println("I don't know about that, I said choose from 1-9 ");
        }
    }
}
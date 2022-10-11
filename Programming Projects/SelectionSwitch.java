package pkg4thqtritj;
import java.util.Scanner;
public class SelectionSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x;
        System.out.print("Input an Integer [1-10]: ");
        x= sc.nextInt();
        switch(x){
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four"); break; 
            case 5: System.out.println("Five"); break;
            case 6: System.out.println("Six"); break;
            case 7: System.out.println("Seven"); break;
            case 8: System.out.println("Eight"); break;
            case 9: System.out.println("Nine"); break;
            case 10: System.out.println("Ten"); break;
        }
                char ch;
        System.out.println("Enter a letter [A-E]:");
        ch= sc.next(). charAt(0);
        switch(ch){
            case'A':
            case 'a':
                System.out.println("Alligatot");
                break;
            case 'B':
            case 'b':
                System.out.println("Bear");
                break;
             case 'C':
            case 'c':
                System.out.println("Cougar");
                break;
            case 'D':
            case 'd':
                System.out.println("Dolpain");
                break;
                case 'E':
            case 'e':
                System.out.println("Elephant");
                break;
            default:
                System.out.println("Letter not included!");
        }
    }
}

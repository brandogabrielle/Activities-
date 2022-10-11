
package ds11activities;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        boolean keepLooping=true;
        double input;
        Scanner sc= new Scanner(System.in); 
        while(keepLooping){
            System.out.println("Enter a postive value < 100 :");
            input = sc.nextDouble();
            if(0<input&&input <100){
                keepLooping=false;
            }
        }
    }
}

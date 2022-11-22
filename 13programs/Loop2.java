
package thirteenprograms;
import java.util.Scanner;
public class Loop2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        
        System.out.println("Enter a number to show all even: ");
        num=sc.nextInt();
        

        for (int j = 0; j < num; j++) {
            if(j%2==0){
                System.out.print(j + " ");  
            }
        }
    }
}


package pkg4thqtritj;
import java.util.Scanner;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x[]; 
        x =new int [5];
        for (int i=0; i <=x.length-1; i++){
            System.out.println("Enter an Integer to put into the array ["+i+"]: ");
            x [i]= sc.nextInt();
                  }
        for (int i=0; i<=x.length-1; i++){
              System.out.println("The value inside array x ["+i+"]: " +x[i]);
              }
        int y[] = { 11, 22, 33, 44, 55, 66};
        for (int i:y) {
            System.out.println("The value inside array y: "+i);
        }
        
        String names [];
        names = new String [4];
        for ( int i=0; i <=names.length-1; i++){
            System.out.println("Enter names for index ["+i+"]: ");
            names [i] = sc.next();
        }
           for ( int i=0; i <=names.length-1; i++){
            System.out.println("Enter inside index ["+i+"]: "+names[i]);
        }
           String neyms[] = { "Summer", "Buchok", "Cho'Gath", "Buboy"};
           for (String s: neyms){
               System.out.println("The names inside array names: "+s);
           }
        
        }
    
}


package thirteenprograms;
import java.util.Scanner;
public class Loop3 {
    public static void main(String[] args){           
    Scanner sc=new Scanner(System.in);
        int in,ter,i;
        double total;
        float quo;
        System.out.println("Enter initializing number: ");
        in=sc.nextInt();
        System.out.println("Enter terminating number");
        ter=sc.nextInt();
        System.out.println("Choose an operator: ");
        char ope= sc.next().charAt(0);
        
        if(in<ter){
            switch(ope){
             case '+':
                for(i=in;i<ter;i++){
                    total=i+ter;
                    System.out.println(i+" + "+ter+" = "+total);
                }
            break;
             case '-':
                  for(i=in;i<ter;i++){
                    total=i-ter;
                    System.out.println(i+" - "+ter+" = "+total);
                }
            break;
             case '*':
                  for(i=in;i<ter;i++){
                    total=i*ter;
                    System.out.println(i+" * "+ter+" = "+total);
                }
            break;
             case '/':
                  for(i=in;i<ter;i++){
                    quo=i/ter;
                    double rem= i%ter;
                    System.out.println(i+" / "+ter+" = "+quo);
                    System.out.println("Remainder = "+rem);
                }
            break;
             default:System.out.println("Invalid output!");
            } 
        }
        else{
            System.out.println("INVALID! The terminating number was higher than the initializing number!");
        }
    }
}

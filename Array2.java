
package activitiesbsds;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Number of patient; ");
        int num= sc.nextInt();
        
        String[] names= new String[num];
        int[] days=new int[num];
        int[] rate= new int[num];
        int[] disc=new int[num];
        double[] total= new double[num];
        double[] an= new double[num];
        double[] fd=new double[num];
        for(int i=0;i<num;i++){
            System.out.println("Name: ");
            names[i]=sc.next();
             System.out.println("Days Confined: ");
                            days[i]=sc.nextInt();
             System.out.println("Rate per day: ");
                            rate[i]=sc.nextInt();
             System.out.println("Discount: ");
                            disc[i]=sc.nextInt(); 
                    fd[i]=disc[i]*0.01;
                    an[i]=rate[i]*fd[i];
                    total[i]= ((days[i]*rate[i])-an[i]);

                    System.out.println("");
                    System.out.println("Name: "+names[i]);
                    System.out.println("Days confined: "+days[i]);
                    System.out.println("Rate per day: "+rate[i]);
                    System.out.println("Discount: " +disc[i]+"%");   
                    System.out.println("Total Bill:" +total[i]);
                    System.out.println("");
        }
    }
}

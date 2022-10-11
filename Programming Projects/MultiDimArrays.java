package pkg4thqtritj;
import java.util.Scanner;
public class MultiDimArrays {
    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        int twoDim[] []= new int [3][5];
        for (int row = 0; row<=twoDim.length; row++){
            for (int col =0; col<= twoDim[row].length-1; col++){
                System.out.print("Input value inside row ["+row+"]  column["+col+"]: ");
                twoDim[row] [col] = sc.nextInt();
            }
        }
        for (int row= 0; row<=twoDim.length-1; row++){
            for(int col=0; col<=twoDim[row].length-1; col++) {
                System.out.print("Value inside array ["+row+"] ["+col+"]: "+twoDim[row] [col]);
            }
        }
        int twoDim2 [][] = {{11, 22, 33}, {56, 57, 78, 89}, {100,200,300, 400,500}};
        for (int row=0; row<=twoDim.length-1; row++){
            for (int col=0; col <=twoDim2[row].length-1; col++){
                System.out.println("Value inside array ["+row+"]["+col+"]: "+ twoDim2 [row] [col]);
            }
        }
        String neyms [] [] = new String [3][3];
        for (int r=0; r<=neyms.length-1; r++){
            for (int c=0; c<=neyms[r].length-1; c++){
                System.out.print("Input a name inside row ["+r+"] col["+c+"]: ");
                neyms [r][c] = sc.next();
            }
        }
        for (int r=0; r<=neyms.length-1; r++){
            for (int c=0; c<=neyms[r].length-1; c++){   
                System.out.println("String inside array ["+r+"] ["+c+"]: " +neyms [r][c]);
            }
        }
        String names [] [] = {{" Bernadeth", "Carlbelle"," Cassandra"},{ "Eman", "Ferz"}, 
            {"Gabriel", "John", "Dexter", "Judith Grace","Justine Bea" }};
        for ( int r=0; r<=names.length-1; r++){
            for( int c=0; c<=names [r].length-1; c++){
                System.out.println("String inside array2 ["+r+"] ["+c+"] "+names [r][c]);
            }
        }
    }
}

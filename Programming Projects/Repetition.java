package pkg4thqtritj;
public class Repetition {
    public static void main(String[] args) {
        //while loop
        int x = 1; // initial value
        while( x<=5){ // termanating condition
            System.out.println("Inside the while iteration: "+x);
            x = x + 1; // iteration - increment/decrement
                  }
        x=1; 
        do{
            System.out.println("Inside the do-while iteration:"+x );
            x +=1; // iteration, += short hand
         }while (x<=5); // terminating condition
        
       for (x=1; x<=5; x++) { // init.val, cond, iteration
           System.out.println("Inside the for iteration: "+x);
                 }
       int y[] = {11, 22, 33, 44, 55, 66};
       // traversing array values using a loop
       for ( int z = 0; z<=y.length-1; z++){
           System.out.println("Value inside array index ["+z+"]");
                  }
       // for-each loop
       for ( int z : y) {
           System.out.println("Value inside array:" +z);
                   }
       String names [] = {"brando", "gab", "mirla"}; 
       for (int z= 0; z<= names.length-1; z++) {
           System.out.println("Value inside array index ["+z+"]: "+names[z]);
       }
    }
}

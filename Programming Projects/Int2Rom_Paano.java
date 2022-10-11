package pkg4thqtritj;
import java.util.Scanner;
public class Int2Rom_Paano {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int num= 0;
         int one, ten, hun, tho;
         System.out.print("Enter an integer [1-3,999]: ");
         num = sc.nextInt();
         num= num%10000;
                tho= (int) num / 1000;
                switch(tho){   
            case 3: System.out.print("MMM"); break;
            case 2: System.out.print("MM"); break;
            case 1: System.out.print("M"); break;
           }
                 num = num%1000;
                hun= (int) num /100;
        switch (hun){
            case 9: System.out.print("CM "); break;
            case 8: System.out.print("DCCC"); break;
            case 7: System.out.print("DCC"); break;
            case 6: System.out.print("DC"); break;
            case 5: System.out.print("D"); break;
            case 4: System.out.print("CD"); break;
            case 3: System.out.print("CCC"); break;
            case 2: System.out.print("CC"); break;
            case 1: System.out.print("C"); break;
        }
         num = num % 100;
                 ten = (int) num / 10;
        switch(ten){
            case 9: System.out.print("XC"); break;
            case 8: System.out.print("LXXX"); break;
            case 7: System.out.print("LXX"); break;
            case 6: System.out.print("LX"); break;
            case 5: System.out.print("L"); break;
            case 4: System.out.print("XL"); break;
            case 3: System.out.print("XXX"); break;
            case 2: System.out.print("XX"); break;
            
        }
         one =(int) num %10;
                if (ten ==1){
                switch (one){
             case 9: System.out.print("XIX"); break;
             case 8: System.out.print("XVIII"); break;
             case 7: System.out.print("XVII"); break;
             case 6: System.out.print("XVI"); break;
             case 5: System.out.print("XV"); break;
             case 4: System.out.print("XIV"); break;
             case 3: System.out.print("XIII"); break;
             case 2: System.out.print("XII"); break;
             case 1: System.out.print("XI"); break;
             case 0: System.out.println("X"); break;
        }
    }
         else{
           switch (one){
            case 9: System.out.print("IX"); break;
            case 8: System.out.print("VIII"); break;
            case 7: System.out.print("VII"); break;
            case 6: System.out.print("VI"); break;
            case 5: System.out.print("V"); break;
            case 4: System.out.print("IV"); break;
            case 3: System.out.print("III"); break;
            case 2: System.out.print("II"); break;
            case 1: System.out.print("I"); break;
            }
                }
    }
}

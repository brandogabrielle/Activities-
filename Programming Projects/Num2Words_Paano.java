package pkg4thqtritj;
import java.util.Scanner;
public class Num2Words_Paano {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long num;
        int hmil, tmil, mil, hthou, tthou, thou, huns, tens, ones;
         System.out.print("Enter an integer [1-999,999,999]: ");
       String m= "Million";
       String t= "Thousand";
        num= sc.nextLong();
        num= num% 1000000000;
        hmil= (int)num /100000000;
            switch(hmil){
            case 9: System.out.print("Nine Hundred "); break;
            case 8: System.out.print("Eight Hundred "); break;
            case 7: System.out.print("Seven Hundred  "); break;
            case 6: System.out.print("Six Hundred "); break;
            case 5: System.out.print("Five Hundred "); break;
            case 4: System.out.print("Four Hundred "); break;
            case 3: System.out.print("Three Hundred "); break;
            case 2: System.out.print("Two Hundred "); break;
            case 1: System.out.print("One Hundred"); break;
            }
        num= num% 100000000;
        tmil= (int) num /10000000;
            switch(tmil){
            case 9: System.out.print("Ninety "); break;
            case 8: System.out.print("Eighty "); break;
            case 7: System.out.print("Seventy "); break;
            case 6: System.out.print("Sixty "); break;
            case 5: System.out.print("Fifty "); break;
            case 4: System.out.print("Fourty "); break;
            case 3: System.out.print("Thirty "); break;
            case 2: System.out.print("Twenty "); break;
            }
        num= num% 10000000;
        mil= (int) num / 1000000;
        if (tmil ==1){
            switch(mil){
             case 9: System.out.print("Nineteen "); break;
             case 8: System.out.print("Eighteen "); break;
             case 7: System.out.print("Seventeen "); break;
             case 6: System.out.print("Sixteen "); break;
             case 5: System.out.print("Fifteen "); break;
             case 4: System.out.print("Fourteen "); break;
             case 3: System.out.print("Thirteen "); break;
             case 2: System.out.print("Twelve "); break;
             case 1: System.out.print("Eleven "); break;
             case 0: System.out.println("Ten "); break;
            }
        }
        else{
            switch(mil){
            case 9: System.out.print("Nine "); break;
            case 8: System.out.print("Eight "); break;
            case 7: System.out.print("Seven "); break;
            case 6: System.out.print("Six "); break;
            case 5: System.out.print("Five "); break;
            case 4: System.out.print("Four "); break;
            case 3: System.out.print("Three "); break;
            case 2: System.out.print("Two "); break;
            case 1: System.out.print("One "); break;
         
            }
         
         }
         if (num >=1000000){
             System.out.print("Million "); 
             }
        num= num %1000000;
        hthou= (int) num/100000;
            switch(hthou){
            case 9: System.out.print("Nine Hundred "); break;
            case 8: System.out.print("Eight Hundred "); break;
            case 7: System.out.print("Seven Hundred  "); break;
            case 6: System.out.print("Six Hundred "); break;
            case 5: System.out.print("Five Hundred "); break;
            case 4: System.out.print("Four Hundred "); break;
            case 3: System.out.print("Three Hundred "); break;
            case 2: System.out.print("Two Hundred "); break;
            case 1: System.out.print("One Hundred"); break;
            }
        num= num%100000;
                tthou=(int) num/ 10000;
            switch (tthou){
            case 9: System.out.print("Ninety "); break;
            case 8: System.out.print("Eighty "); break;
            case 7: System.out.print("Seventy "); break;
            case 6: System.out.print("Sixty "); break;
            case 5: System.out.print("Fifty "); break;
            case 4: System.out.print("Fourty "); break;
            case 3: System.out.print("Thirty "); break;
            case 2: System.out.print("Twenty "); break;
             }
        num= num%10000;
                thou= (int) num / 1000;
        if (tthou == 1){
            switch(thou){
             case 9: System.out.print("Nineteen "); break;
             case 8: System.out.print("Eighteen "); break;
             case 7: System.out.print("Seventeen "); break;
             case 6: System.out.print("Sixteen "); break;
             case 5: System.out.print("Fifteen "); break;
             case 4: System.out.print("Fourteen "); break;
             case 3: System.out.print("Thirteen "); break;
             case 2: System.out.print("Twelve "); break;
             case 1: System.out.print("Eleven "); break;
             case 0: System.out.print("Ten "); break;
            }
        }
        else{
        switch(thou){
            case 9: System.out.print("Nine "); break;
            case 8: System.out.print("Eight "); break;
            case 7: System.out.print("Seven "); break;
            case 6: System.out.print("Six "); break;
            case 5: System.out.print("Five "); break;
            case 4: System.out.print("Four "); break;
            case 3: System.out.print("Three "); break;
            case 2: System.out.print("Two "); break;
            case 1: System.out.print("One "); break;
           }
        }
         if (num >=1000){
             System.out.print("Thousand "); 
             }
        num = num%1000;
                huns= (int) num /100;
        switch (huns){
            case 9: System.out.print("Nine Hundred "); break;
            case 8: System.out.print("Eight Hundred "); break;
            case 7: System.out.print("Seven Hundred "); break;
            case 6: System.out.print("Six Hundred "); break;
            case 5: System.out.print("Five Hundred "); break;
            case 4: System.out.print("Four Hundred "); break;
            case 3: System.out.print("Three Hundred "); break;
            case 2: System.out.print("Two Hundred "); break;
            case 1: System.out.print("One Hundred "); break;
        }
        num = num % 100; // refractor- removes 100s
                 tens = (int) num / 10;
        switch(tens){
            case 9: System.out.print("Ninety "); break;
            case 8: System.out.print("Eighty "); break;
            case 7: System.out.print("Seventy "); break;
            case 6: System.out.print("Sixty "); break;
            case 5: System.out.print("Fifty "); break;
            case 4: System.out.print("Fourty "); break;
            case 3: System.out.print("Thirty "); break;
            case 2: System.out.print("Twenty "); break;
            
        }
        
                ones =(int) num %10;
         if (tens ==1){
                switch (ones){
             case 9: System.out.print("Nineteen"); break;
             case 8: System.out.print("Eighteen"); break;
             case 7: System.out.print("Seventeen"); break;
             case 6: System.out.print("Sixteen"); break;
             case 5: System.out.print("Fifteen"); break;
             case 4: System.out.print("Fourteen"); break;
             case 3: System.out.print("Thirteen"); break;
             case 2: System.out.print("Twelve"); break;
             case 1: System.out.print("Eleven "); break;
             case 0: System.out.println("Ten "); break;
        }
    }
         else{
            switch (ones){
            case 9: System.out.print("Nine"); break;
            case 8: System.out.print("Eight"); break;
            case 7: System.out.print("Seven"); break;
            case 6: System.out.print("Six"); break;
            case 5: System.out.print("Five"); break;
            case 4: System.out.print("Four"); break;
            case 3: System.out.print("Three"); break;
            case 2: System.out.print("Two"); break;
            case 1: System.out.print("One"); break;
            }
        }               
    }
 }

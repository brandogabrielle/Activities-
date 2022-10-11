package pkg4thqtritj;
import java.util.Scanner;
public class Rom2Int_Paano {
        static String roman;
        static int number;
        public static void main(String args[]) {
                Rom2Int_Paano d = new Rom2Int_Paano();
                  d .convertInteger();
                  d .printRoman(roman);
        }
        public void convertInteger () {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a Roman Number: ");
                roman = scan.nextLine();
                roman = roman.toUpperCase();
                
                int l=  roman.length();
                int num1=0;
                int num2 = 0;
                for (int i=l-1;i>=0;i--)
                { 
                        char x =  roman.charAt(i);
                        x = Character.toUpperCase(x);
                        switch(x)
                        {  
                                case 'I':
                                num2 = num1;
                                num1 = 1;
                                break;
                             case 'V':
                                     num2 = num1;
                                num1 = 5;
                                break;
                                case 'X':
                                        num2 = num1;
                                num1 = 10;
                                break;
                                case 'L':
                                        num2 = num1;
                                num1 = 50;
                                break;
                                case 'C':
                                        num2 = num1;
                                num1 = 100;
                                break;
                                case 'D':
                                        num2 = num1;
                                num1 = 500;
                                break;
                                case 'M':
                                        num2 = num1;
                                num1 = 1000;
                                break;
                        }           
                        if (num1<num2)
                        {number= number-num1;}
                         else
                        number= number+num1;
                }
        }
        public static void printRoman (String roman){
                System.out.println ("The equivalent of the Roman numeral  is "+number);
        }
 
      
}
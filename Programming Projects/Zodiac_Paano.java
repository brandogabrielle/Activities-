package pkg4thqtritj;
import java.util.Scanner;
public class Zodiac_Paano {
    public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
           int x1, x2;
                      System.out.println("Enter your birth month:");
           x1= sc.nextInt();
                     System.out.println("Enter your birth day:");
          x2= sc.nextInt();
                  if ( x1 >12 || x2 >31 ){
            System.out.println("Invalid date!");
        }
        else if (x1== 2 && x2 >28){
            System.out.println("Invalid date!");
        }
          else if  ((x1== 1 && x2>=10) || (x1 == 2 & x2 <=18) ){
            System.out.println("Your Zodiac sign is Aquarius");
        }
        else if ((x1 == 2 && x2>=19) || (x1==3 && x2<19)){
            System.out.println("Your Zodiac sign is Pisces");
        }
        else if ((x1 == 3 && x2>=20) || (x1==4 && x2<19)){
            System.out.println("Your Zodiac sign is Aries");
        }
        else if ((x1 == 4 && x2>=20) || (x1==5 && x2<20)){
            System.out.println("Your Zodiac sign is Taurus");
        }
        else if ((x1 == 5 && x2>=21) || (x1==6 && x2<20)){
            System.out.println("Your Zodiac sign is Gemini");
        }
        else if ((x1 == 6 && x2>=21) || (x1==7 && x2<=22)){
            System.out.println("Your Zodiac sign is Cancer");
        }else if ((x1 == 7 && x2>=23) || (x1==8 && x2<=22)){
            System.out.println("Your Zodiac sign is Leo");
        }
        else if ((x1 == 8 && x2>=23) || (x1==9 && x2<22)){
            System.out.println("Your Zodiac sign is Virgo");
        }else if ((x1 == 9 && x2>=23) || (x1==10 && x2<=22)){
            System.out.println("Your Zodiac sign is Libra");
        }
        else if ((x1 == 10 && x2>=23) || (x1==11 && x2<=21)){
            System.out.println("Your Zodiac sign is Scorpio");
        }
        else if ((x1 == 11 && x2>= 22) || (x1==12 && x2<=21)){
            System.out.println("Your Zodiac sign is Sagitarrius");
        }
        else if ((x1 == 12 && x2>=22) || (x1==1 && x2<20)){
            System.out.println("Your Zodiac sign is Capricorn");
        }
    }
}

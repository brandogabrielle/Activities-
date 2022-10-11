package pkg4thqtritj;
import java.util.Scanner;
public class StringSamples {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char strCh [] = { 'p', 'o', 't', 'a', 't', 'o' }; // a character array
        String str= new String(strCh);
                System.out.println("Hello, welcome Master: "+str);
        for (int i=0 ; i<=str.length()-1; i++) {
            System.out.println(" Character at index ["+i+"]: "+str.charAt(i));
        }
                String str2;
        System.out.print("Enter a Name: ");
        str2= sc.next(); 
        str2 =str2.toUpperCase();
        for (int i=0; i<=str.length()-1; i++){
            System.out.println(" Character at index ["+i+"]: "+str2.charAt(i));
        }
        System.out.println("Good day: "+str.concat(str2));
        if (str2.equals("Dog")){
            System.out.println("Aww...Aww..");
        }
        else if (str2.equals("Cat")){
            System.out.println("Meow.. Meow...");
        }
    }
}

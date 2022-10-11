package pkg4thqtritj;
import java.util.Scanner; 
public class TestAnimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Animal a= new Animal();
        System.out.print("Input name: ");
        a.setName(sc.nextLine());
        System.out.print("Input age: ");
        a.setAge(sc.nextInt());
        System.out.print("Input weight: ");
        a.setWeight(sc.nextDouble());      
        System.out.print("Input height: ");
        a.setHeight(sc.nextDouble());
        System.out.println(a.getName()+"'s age is "
                +a.getAge()+" and has a weight of "
                +a.getWeight()+" pounds and a height of "+a.getHeight());
        
        Animal a1= new Animal ("Summer", 2, 20.5,16.5 );
        a1.eat();
        a1.move();
          System.out.println(a1.getName()+"'s age is "
                +a1.getAge()+" and has a weight of "
                +a1.getWeight()+" pounds and a height of "+a1.getHeight());
        
    }
}

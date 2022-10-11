package pkg4thqtritj;

public class TestCanine {
    public static void main(String[] args) {
        Canine c1= new Canine();
        c1.setBreed("Mastiff");
        c1.setName("Summer");
        c1.setAge(2);
        c1.setWeight(23.5);
        c1.setHeight(16.8);
        c1.move();
        c1.eat();
         System.out.println(c1.getName()+"'s age is "
                +c1.getAge()+" and has a weight of "
                +c1.getWeight()+" pounds and a height of "+c1.getHeight());
         System.out.println(c1.getName()+"'s breed is "+c1.getBreed());
         
         Canine c2= new Canine ("Buchok", 2, 24.4, 14.5);
          c2.move();
        c2.eat();
         System.out.println(c2.getName()+"'s age is "
                +c2.getAge()+" and has a weight of "
                +c2.getWeight()+" pounds and a height of "+c2.getHeight());
    }
}

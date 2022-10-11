package pkg4thqtritj;

public class Animal {

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
       if(age >=0){
           this.age = age;
       }
       else {
           System.out.println("Invalid age!");
           this.age= 0; 
       }
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
      if(weight >=0){
          this.weight = weight;
      }
      else{
          System.out.println("Invalid height!");
          this.weight=0;
      }
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if(height >=0){
            this.height = height;
        }
        else{
            System.out.println("Invalid height!");
            this.height=0;
        }
    }
    private String name;
    private int age; 
    private double weight; 
    private double height;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void move(){
        System.out.println(getName()+ " is sleeping.");
    }
    public void eat() {
         System.out.println(getName()+ " is eating. Yum!");
    }
    public Animal() {} 
    public Animal (String name, int age, double weight, double height){
        this.name= name;
               if(age >=0){
           this.age = age;
       }
       else {
           System.out.println("Invalid age!");
           this.age= 0; 
         if(weight >=0){
      }
      else{
          System.out.println("Invalid height!");
          this.weight=0;
          if(height >=0){
            this.height = height;
        }
        else{
            System.out.println("Invalid height!");
            this.height=0;
                 }
             }
         }
    }
}

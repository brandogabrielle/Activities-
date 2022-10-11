package pkg4thqtritj;

public class Canine extends Animal{
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public Canine(){
        super(); // call to the parent constructor
    }
    public Canine(String name, int age, double weight, double height){
        super(name, age, weight, height);
    }
    
}


package activitiesbsds;

public class Array1 {
    public static void main(String[] args) {
    
    String[] names={"Jefe","Juan","Ethyl","Muros","Paco"};    
    int[] no={101,232,786,987,675};
    int[] eng={89,82,91,85,89};
    int[] math={87,98,79,87,85};
    int[] sci={89,91,86,87,79};
    
    for(int i = 0; i<5;i++){
        
        double average=((eng[i]+math[i]+sci[i])/3);
        System.out.println("Student no: "+no[i]+ " Name: "+names[i]+" English: "+eng[i]+" Math: "+math[i]+" Science: "+sci[i]+" Average: "+average);
    }
    
    
    
    }   
}

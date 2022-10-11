package pkg4thqtritj;

public class MyDate {
    public int  day; 
    public int month;
    public int year;
    
    public String printMyDate() {
        return "Date Printed: " +day+" / " +month+ " / " +year;
    }
     public void printMyDate(int day, String month, int year ){
        this.day= day;
        this.year= year;
        System.out.println(day+ " - "+month+ " - "+year);
    }
    public void printMyDate(String month, int day, int year ){
        this.day= day;
        this.year= year;
        System.out.println(month+ " "+day+ ", "+year);
    }
    public void printMonth(){
        switch(month){
            case 1: System.out.println("January "+day+", "+year ); break;
            case 2: System.out.println("February "+day+", "+year); break;
            case 3: System.out.println("March "+day+", "+year); break;
            case 4: System.out.println("April "+day+", "+year); break;
            case 5: System.out.println("May "+day+", "+year); break;
            case 6: System.out.println("June "+day+", "+year); break;
            case 7: System.out.println("July "+day+", "+year); break;
            case 8: System.out.println("August "+day+", "+year); break;
            case 9: System.out.println("September "+day+", "+year); break;
            case 10: System.out.println("October "+day+", "+year); break;
            case 11: System.out.println("November "+day+", "+year); break;
            case 12: System.out.println("December "+day+", "+year); break;
            default: System.out.println("Not a month! ");
            
        }
    }
    public MyDate (){
    }
    
    public MyDate(int day, int month, int year) {
        this.day= day;
        this.month= month;
        this.year= year;
    }
}

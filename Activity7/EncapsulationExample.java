class Encapsulation{
    private String name;
    private double grade;

    public String getName(){
        return name;
    }

    public double getGrade(){
        return grade;
    }

    public void setName(String inputName){
        name = inputName;
    }

    public void setGrade(double inputGrade){
        grade = inputGrade;
    }   
}

public class EncapsulationExample {    
    public static void main(String[] args) 
    {
        Encapsulation display = new Encapsulation();
        String name = "James Gosling";
        double grade = 87;
        
        display.setName(name);
        display.setGrade(grade);
        
        System.out.print("Name: " + display.getName());
        System.out.print("\nGrade: " + display.getGrade() + "\n");
  
    }
    
}

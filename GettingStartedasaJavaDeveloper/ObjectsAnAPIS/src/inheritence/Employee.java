package inheritence;

public class Employee extends Person {
    private String employeeId;
    
    private String title;

    public Employee(){
        //super(); // calls default constructor of the super class
        super("Johhn Doe"); // calls the construto in super class ith name parameter
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public String getTitle(){
        return title;
    }

    public void setName(String title){
        this.title = title;
    }

    
}

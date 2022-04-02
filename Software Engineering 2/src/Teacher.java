public class Teacher {
    
    private String name;
    private int id;
    private static int ids = 0;
    private int salary;
    private int salaryEarned;
    
    public Teacher(String name, int salary){
        this.id=++ids;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setSalary(int salary){
        this.salary=salary;
    }
    
     public int getSalary(){
        return  salary;
    }

    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }
    
    
    
    
}

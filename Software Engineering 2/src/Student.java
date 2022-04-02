public abstract class Student {
    
    protected String name;
    protected int id;
    protected static int ids = 0;
    protected int tuitionPaid;
    protected int tuitionTotal = 3000;
    
    public Student(String name){
        this.tuitionPaid=0;
        this.id=++ids;
        this.name=name;
    }
    
    public void payFees(int tuition){
    tuitionPaid+=tuition;
    School.updateTotalMoneyEarned(tuitionPaid);
    }
    
    public int getID(){
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getTuitionPaid() {
        return tuitionPaid;
    }
    
    public int getTuitionTotal() {
        return tuitionTotal;
    }

    
    public int getRemainingTuition(){
        return tuitionTotal-tuitionPaid;
    }
    
    
    
    
    
    
    
    
}

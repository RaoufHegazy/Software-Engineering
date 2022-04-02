public class ScholarshipStudent extends Student{
    
    private int scolarship;
    private int former_cost = tuitionTotal;
    
    public ScholarshipStudent(String name, int scolarship){
        super(name);
        this.scolarship = scolarship;
        tuitionTotal = 3000 - scolarship;       
    }
    
    public int getScholarship(){
	return this.scolarship;
	}
    
    
    
}

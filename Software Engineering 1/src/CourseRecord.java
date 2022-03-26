import java.util.Vector;
import java.util.Enumeration; 
public class CourseRecord {
private Student student;
private Vector assignments;
CourseRecord(Student s) {
    this.student = s;
    assignments=new Vector();}
public Student getStudent() {
return student;
}
public void addAssignment(Assignment a) {
assignments.addElement(a);
}
public Enumeration getAssignments() {
return assignments.elements();
}
public double average() throws NotYetSetException {
        double total = 0;
        double average = 0;
        int numberWithMarks = 0;
        Enumeration<Assignment> e = assignments.elements();
        while (e.hasMoreElements()) {
            try {
                total += e.nextElement().getMark();
                numberWithMarks++;
            } catch (Exception ex) {} 
        }
        average = total / numberWithMarks;

        return average;
    }

    public boolean canTakeFinalExam() {
        int count = 0;
        Enumeration<Assignment> e = assignments.elements();
        while(e.hasMoreElements()) {
            try {
                e.nextElement().getMark();
                count++;
            } catch (Exception ex) {}
        }
        return count >= 3;
    }
}
import java.util.List;
import java.util.ArrayList;
public class School {
    
    private List<Student> students = new ArrayList<>();
    private List<ScholarshipStudent> scholarshipstudents = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;
    
    public School() {
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }
    
    public List<Teacher> getTeachers() {
        return teachers;
    }
    
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public List<ScholarshipStudent> getScholarshipStudents() {
        return scholarshipstudents;
    }
    
    public void addStudent(ScholarshipStudent scholarshipstudent) {
        scholarshipstudents.add(scholarshipstudent);
    }
    
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
    
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }
    
    
    
    
    
}

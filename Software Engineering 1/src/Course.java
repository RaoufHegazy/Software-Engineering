import java.util.Vector;
import java.util.Enumeration; 
public class Course {
private String title;
private Vector courseRecords;
Course(String t) {
    this.title=t;
    courseRecords=new Vector();}
public String getTitle() {return title;}
public void addCourseRecord(CourseRecord cr) {
courseRecords.addElement(cr);
}
public Enumeration getCourseRecords() {
return courseRecords.elements();
}
public void printCourseStudents() {
        Enumeration<CourseRecord> e = courseRecords.elements();
        String sName = "";
        System.out.println("Course Students :- ");
        while (e.hasMoreElements()) {
            sName = e.nextElement().getStudent().getName();
            System.out.println(sName);
        }
    }

    public void printBestStudent() {
        String bestStudent = "";
        double bestAverage = 0;
        double average = 0;
        Enumeration<CourseRecord> e = courseRecords.elements();
        while (e.hasMoreElements()) {
            try {
                CourseRecord cr = e.nextElement();
                average = cr.average();
                if (average > bestAverage) {
                    bestAverage = average;
                    bestStudent = cr.getStudent().getName();
                }
            } catch (Exception ex) {
            }  
        }
        System.out.println("Best Student - " + bestStudent);

    }

    public void printFinalExamStudents() {
        Enumeration<CourseRecord> e = courseRecords.elements();
        while(e.hasMoreElements()) {
            CourseRecord cr = e.nextElement();
            if (cr.canTakeFinalExam()) {
                System.out.println("Student " + cr.getStudent().getName() + " can take the final exam for this course");
            } else {
                System.out.println("Student " + cr.getStudent().getName() + " can not take the final exam for this course");
            }
        }
}

}
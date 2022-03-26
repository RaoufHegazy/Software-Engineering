public class main {

    public static void main(String[] args) throws Exception{
        Student s1 = new Student("s1");
        Student s2 = new Student("s2"); 
        Student s3 = new Student("s3");
        
        CourseRecord cr1 = new CourseRecord(s1);
        CourseRecord cr2 = new CourseRecord(s2);
        CourseRecord cr3 = new CourseRecord(s3);
        
        Assignment a1 = new Assignment(1);
        Assignment a2 = new Assignment(30);
        Assignment a3 = new Assignment(5);
        Assignment a4 = new Assignment(7);
        Assignment a5 = new Assignment(8);
        Assignment a6 = new Assignment(9);
        Assignment a7 = new Assignment(9);
        
        cr1.addAssignment(a1);
        cr1.addAssignment(a2);
        cr2.addAssignment(a3);
        cr2.addAssignment(a4);
        cr3.addAssignment(a5);
        cr3.addAssignment(a6);
        cr3.addAssignment(a7);
        
        Course c1 = new Course("c1");
        Course c2 = new Course("c2");
        
        c1.addCourseRecord(cr3);
        c1.addCourseRecord(cr1);
        c2.addCourseRecord(cr2);
        
        c1.printCourseStudents();
        System.out.println("========================================================");
        c1.printBestStudent();
        System.out.println("========================================================");
        c1.printFinalExamStudents();
    }
    
}

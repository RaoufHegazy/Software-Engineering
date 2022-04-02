public class main {
    
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher("t1",2000);
        Teacher t2 = new Teacher("t2",2000);
        Teacher t3 = new Teacher("t3",2000);
        Teacher t4 = new Teacher("t4",2000);
        
        
        Student s1 = new StandardStudent("s1");
        Student s2 = new StandardStudent("s2");
        Student s3 = new StandardStudent("s3");
        Student s4 = new StandardStudent("s4");
        ScholarshipStudent s5 = new ScholarshipStudent("s5",1000);
        ScholarshipStudent s6 = new ScholarshipStudent("s6",1500);
        ScholarshipStudent s7 = new ScholarshipStudent("s7",2000);
        
        
        School highSchool = new School();       
        highSchool.addTeacher(t1);
        highSchool.addTeacher(t2);
        highSchool.addTeacher(t3);
        highSchool.addTeacher(t4);
        highSchool.addStudent(s1);
        highSchool.addStudent(s2);
        highSchool.addStudent(s3);
        highSchool.addStudent(s4);
        highSchool.addStudent(s5);
        highSchool.addStudent(s6);
        highSchool.addStudent(s7);
        
        
        
        
        
        
        
    }
    
}

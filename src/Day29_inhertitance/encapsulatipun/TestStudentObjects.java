package Day29_inhertitance.encapsulatipun;

import Day29_inhertitance.Student;

public class TestStudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Hamza", 26, 'M','A',"MIT");
        student1.setSchoolName("Harvard");
        student1.setGrade('B');
        System.out.println(student1);
    }
}

package day17_customClass;

public class StudentTest {
    public static void main(String[] args) {
        student student1 = new student();
        student1.setInfo("Joy", 'M', 35,567843, 'A', "fulltime" );

        student student2 = new student();
        student2.setInfo("Denis", 'M', 42, 8757483, 'B',"partTime");


        System.out.println(student2);

        student1.study();
    }




    }


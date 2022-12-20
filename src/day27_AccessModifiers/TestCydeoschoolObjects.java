package day27_AccessModifiers;

public class TestCydeoschoolObjects {
    public static void main(String[] args) {

        System.out.println(Cydeostudent.schoolName);

        Cydeostudent student1 = new Cydeostudent("Ekatarina", 29, 'F');
        Cydeostudent student2 = new Cydeostudent("Alena", 28, 'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);
    }
}

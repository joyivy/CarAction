package Day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevoloperObject {

    public static void main(String[] args) {
        CydeoDecStudent student1 = new CydeoDecStudent("Daniel", 'M', LocalDate.of(1986,11,1), "A1","alumni dev,",2) ;
        System.out.println(student1);
        student1.eat();
        student1.drink();
        student1.sleep();
    }
}

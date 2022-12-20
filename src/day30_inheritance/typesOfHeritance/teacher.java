package day30_inheritance.typesOfHeritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class teacher extends Employee{

    public teacher (String name, char gender, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, gender, DOB, jobTitle, employeeId, salary);
    }

    public void teach(){
        System.out.println(getName() + " is teaching");

    }

}

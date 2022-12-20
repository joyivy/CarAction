package day25_Constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("Joy Ivy",35,'F',"Sdet",125000, LocalDate.of(2022,11,28));
        System.out.println(e1);
        Employee e2 = new Employee("Denis Ferhatovic", 45,'M',"Profosor",80000,LocalDate.of(2021,12,22));
        System.out.println(e2);

    }
}

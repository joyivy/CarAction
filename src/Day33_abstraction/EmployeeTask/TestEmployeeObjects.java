package Day33_abstraction.EmployeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {

   teacher teacher1 = new teacher("James", 45,'M',"B1", "math Teacher", 75000);

   Developer developer1 =new Developer("Lucy", 30,'F', "C1","Java Devoloper", 95000, "Java");

   Driver driver1 = new Driver("Aaron", 48,'M', "D1","Truck driver", 90000);

   Tester tester1 = new Tester("Joy", 36, 'M', "F3","Tester",125000);



        System.out.println(teacher1);
        System.out.println(developer1);
        System.out.println(driver1);
        System.out.println(tester1);

        System.out.println("_________-------------_______________");

        teacher1.work();
        developer1.work();
        driver1.work();
        tester1.work();
        }
    }
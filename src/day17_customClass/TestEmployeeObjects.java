package day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 =new Employee();
        employee1.setinfo("Joy", 35, 'f' , "Java devoloper" , 95000, "A12");

        Employee employee2 = new Employee();
       employee2.setinfo("Denis", 42, 'M', "Profosor", 90000, "d15");

       Employee employee3 = new Employee();
       employee3.setinfo("Evren", 31, 'F', "Doctor", 150000, "ef76");


       employee2.age=34;
       
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


        employee1.work();
    }
}

package Day28_encapsulation.encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {
        Employee employee1= new Employee("Joy",35,"SDET",150000);

        /*
        employee1.salary=-20000;

        employee1.setSalary(100000);
        employee1.setName("Joy");
        employee1.setAge(35);
        employee1.setJobTitle("SDET");

         */


        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getJobTitle());
        System.out.println(employee1.getSalary());

    }
}

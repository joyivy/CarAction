package Day33_abstraction.EmployeeTask;

public class teacher extends Employee{
    public teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " " + " is teaching.");
    }


}

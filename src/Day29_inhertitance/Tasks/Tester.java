package Day29_inhertitance.Tasks;

import java.sql.SQLOutput;

public class Tester {
    private String name;
    private char gender;
    private int age;
    private String Id;
    private String jobtitle;
    private int salary;

    public Tester(String name, char gender, int age, String id, String jobtitle, int salary) {
       setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobtitle(jobtitle);
        setSalary(salary);
    }
    public void testing(){
        System.out.println(name+ " is testing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {

        return gender;
    }

    public void setGender(char gender) {
        if (gender=='M'&& gender=='F'){
            System.err.println("Invalid Gender"+ gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("Age can not be negatif!! "+age);
       System.exit(1);
        }
        if (age<18 || age>65){
            System.out.println("Invalid Empleyee age. "+age );
        System.exit(1);
        }
        this.age = age;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary<0){
            System.err.println("Salary can not be negatif. "+salary);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", Id='" + Id + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
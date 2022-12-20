package Day29_inhertitance.Tasks;

import java.rmi.ServerError;

public class devaloper {
    private String name;
    private char gender;
    private int age;
    private String id;
    private String jobTitle;
    private int salary;
    private String ProgrammingLanguage;

    public void coding(){
        System.out.println(name + id + " is Coding now");
    }

    public devaloper(String name, char gender, int age, String id, String jobTitle, int salary,String ProgrammingLanguage) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
        setProgrammingLanguage(ProgrammingLanguage);
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
        if (gender=='F'&& gender=='M'){
            System.err.println("Gender is invalid. "+gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("Invalid age. "+age);
            System.exit(1);
        }
        if(age<18||age>65){
            System.err.println("Age should be between 18-65. "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary<0){
            System.err.println("Salary can not be negatif. " +salary);
        }
        this.salary = salary;
    }

    public String getProgrammingLanguage() {
        return ProgrammingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (jobTitle=="Java"|| jobTitle=="Java Script" || jobTitle=="Phyton" || jobTitle=="Ruby"||
                jobTitle=="C#" || jobTitle=="C++"|| jobTitle=="Swift"){
            System.err.println("Job title invalid. "+ jobTitle);
            System.exit(1);
        }
        ProgrammingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "devaloper{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", ProgrammingLanguage='" + ProgrammingLanguage + '\'' +
                '}';
    }
}

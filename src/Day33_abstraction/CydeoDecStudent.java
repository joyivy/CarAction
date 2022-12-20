package Day33_abstraction;

import Day32_finalKeyword.Persontask.Person;

import java.time.LocalDate;

public final class CydeoDecStudent extends Person {

    private final String id;
    private String batchname;
    private int batchNumber;


    public static final String programmingLanguage;

    public CydeoDecStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchname, int batchNumber) {

        super(name, gender, dateOfBirth);
        if (getAge()<18){
            System.err.println("Cydeo Developer mst be at least 18 years old");
            System.exit(1);
        }
        this.id = id;
        setBatchname(batchname);
        setBatchNumber(batchNumber);
    }
static {
        programmingLanguage = "Java";
}

    public String getId() {
        return id;
    }

    public String getBatchname() {
        return batchname;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchname(String batchname) {
        if (batchname.equalsIgnoreCase("zero to hero")|| batchname.equalsIgnoreCase("alumni dev")){
            System.err.println("Invalid batch name: " +batchname+  " \n No such a batch in Cydeo");
            System.exit(1);
        }
        this.batchname = batchname;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <=0){
            System.err.println("Invalid batch number:" +batchNumber+ "\n Batch Number can not be 0 or negatif!!");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating. " + programmingLanguage);

    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking. " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping. " + programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoDecStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                "id='" + id + '\'' +
                ", batchname='" + batchname + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}

/*
1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)
			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative
			Override the eat() & drink() methods and include the programmingLanguage variable in methods body
			Override the toString Method and include the id, batchName, batchNumber variables
 */

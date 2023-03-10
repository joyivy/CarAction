package Day28_encapsulation.encapsulation;

public class Student {

    private String name;
    private int age;

    public String getName() {
       if (name==null){
           System.err.println("Name has not been set.");
           System.exit(1);
       }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit =false;
        for (char each: name.toCharArray()){
            if (Character.isDigit(each)){
                hasDigit=true;
                break;
            }
        }
        if (hasDigit){
            System.err.println("Invalid Name: " +name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge(){ //Read only
       if (age==0){
           System.err.println("Age has not been set");
           System.exit(1);
       }
       return age;
   }

   public void setAge(int age){ //Write only
       if (age<1 || age >100){
           System.err.println("Invalid age: " +age);
           //return;
           System.exit(1);// program gets termineted
       }
       this.age=age;
   }

}

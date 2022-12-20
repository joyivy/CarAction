package day17_customClass;

public class student {
    public String name;
    public char gender;
    public int age;
    public int studuentId;
    public char grade;
    public String isfullTime;

    public void setInfo(String name, char gender, int age, int studuentId, char grade, String isfullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studuentId = studuentId;
        this.grade = grade;
        this.isfullTime = isfullTime;
    }

    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studuentId=" + studuentId +
                ", grade=" + grade +
                ", isfullTime='" + isfullTime + '\'' +
                '}';
    }
        public void study () {
            System.out.println(name + " a student," + " assigned gender at birth is: " + gender + " student." +
                    " It is " + age + " old." + "The ID is: " + studuentId + ". The grade is: " +
                    grade + "It is a full time student: " + isfullTime);
        }
    }


/*
Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()
 */
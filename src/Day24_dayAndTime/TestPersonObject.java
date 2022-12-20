package Day24_dayAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {
    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person()
                , new Person(), new Person()};
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Sebay", 'F', LocalDate.of(1958, 2, 24));
        people[3].setInfo("Evren", 'M', LocalDate.of(1945, 5, 5));
        people[4].setInfo("Denis", 'M', LocalDate.of(1980, 12, 26));

        ArrayList<Person> teamList = new ArrayList<>(Arrays.asList(people));
        // print name and date of birth of each person object

        for (Person each : teamList) {
            System.out.println(each.name + " : "+each.dateOfBirth);
        }
        System.out.println("------------------------------------------------");
        // remove all person objects that has the age greater than 55
        teamList.removeIf(p -> p.age > 55 );
        System.out.println(teamList);
    }
}
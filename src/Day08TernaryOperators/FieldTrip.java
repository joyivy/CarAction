package Day08TernaryOperators;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 3;
        String location = "Unknown";
        int numberOfGroups = 0;
        String teacherName = "unknown";

        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple orchared";
                numberOfGroups = 3;
                teacherName = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numberOfGroups = 7;
                teacherName = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numberOfGroups = 5;
                teacherName = " Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie Teather";
                numberOfGroups = 2;
                teacherName = "Mr. Reyes";

            } else if (grade == 5) {
                location = "Museum";
                numberOfGroups = 5;
                teacherName = "Ms. Lela";
            } else {
                location = "Six Flags";
                numberOfGroups = 6;
                teacherName = " Mr. Watt";
            }
            System.out.println("Local -" + location);
            System.out.println(" Number Of Groups =" + numberOfGroups);
            System.out.println(" Teacher= " + teacherName);
        }
    }
}
/*
2. Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith
			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee
			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson
			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes
			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela
			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt
			        for any other gradeNumber:
			        	location - Unknown
			        	number of groups - 0
			        	teacher in charge - Unknown
 */
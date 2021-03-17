import java.util.List;

public class Result {
    List<Integer> grades;

    public Result (List<Integer> rawData) {
        grades = rawData;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        if (grades.size() > 1 && grades.get(0) <= 60 && grades.get(0) > 0) {
            for (int entry = 1; entry < grades.size(); entry++) {
                if ( grades.get(entry) > -1 && grades.get(entry) <= 40)
                    System.out.println("Test");
            }
        } else {
            System.out.println("Contains no grades.");
        }
        return grades;
    }
}

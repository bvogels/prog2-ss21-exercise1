import java.util.List;

public class Result {
    List<Integer> grades;

    public Result (List<Integer> rawData) {
        grades = rawData;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int current = 0;
        if (grades.size() > 1 && grades.get(0) <= 60 && grades.get(0) > 0) {
            for (int entry = 1; entry < grades.size(); entry++) {
                if (grades.get(entry) >= 38 && grades.get(entry) <= 100) {
                    System.out.println("Current entry: " + grades.get(entry));
                    int tmp = grades.get(entry) % 10;
                    current = (int) Math.floor(grades.get(entry) / 10);
                    if (tmp > 2 && tmp < 5) {
                        current = current * 10 + 5;
                        System.out.println("Current: " + current + ", tmp: " + tmp);
                        grades.set(entry, current);
                    }
                    else if (tmp > 7 && tmp <= 9) {
                        current = current * 10 + 10;
                        System.out.println("Current: " + current + ", tmp: " + tmp);
                        grades.set(entry, current);
                    }
                }
            }
        } else {
            System.out.println("Contains no grades or 60+ students.");
        }
        return grades;
    }
}

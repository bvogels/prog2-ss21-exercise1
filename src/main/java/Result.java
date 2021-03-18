import java.util.List;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int current = 0; // This variable holds the grade/10 for further calculation

        /* This if statement test if the ArrayList adheres to the following criteria:
        1. Comprises more than one entry
        2. Not more than 60 grades
        3. The number of grades matches the first entry in the List (number of students)
        If one condition is not met, the List will be returned unchanged.
         */

        if (grades.size() > 1 && grades.get(0) <= 60 && grades.get(0) > 0 && grades.size() == grades.get(0)+1) {

            /* This for-loop is run 'entry' times, starting with index 1 */

            for (int entry = 1; entry < grades.size(); entry++) {

                /* If the entry is 38 or more and less or equal 100, its elegibility
                for rounding is checked. */

                if (grades.get(entry) >= 38 && grades.get(entry) <= 100) {

                    /* The grade is divided mod (10). This gives merely the eligiblity
                    whether the grade is rounded or not.
                    The variable 'current' holds the result from division
                    of the grade by 10. If the grade is rounded, the result of the division
                    by 10, 5 (or 10) are added and then multiplied by 'current.'
                     */
                    int tmp = grades.get(entry) % 10;
                    current = (int) Math.floor(grades.get(entry) / 10);
                    if (tmp > 2 && tmp < 5) {
                        current = current * 10 + 5;
                        grades.set(entry, current);
                    }
                    else if (tmp > 7 && tmp <= 9) {
                        current = current * 10 + 10;
                        grades.set(entry, current);
                    }
                }
            }
        } else {
            // This line is printed in case of invalid data.
            System.out.println("Contains no grades, 60+ students, or invalid data.");
        }
        return grades;
    }
}

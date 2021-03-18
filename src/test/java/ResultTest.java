import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// Github: https://github.com/bvogels/prog2-ss21-exercise1.git

public class ResultTest {

    @BeforeAll
    static void init() {}

    @BeforeEach
    void setUp() {}

    @DisplayName("Check if the list is unchanged in case it is invalid: Only one element.")
    @Test
    void testCheckResultForValidity1() {
        List<Integer> z = new ArrayList<>(Arrays.asList(5));
        assertTrue(Arrays.equals(z.toArray(), Result.gradingStudents(z).toArray()), "Not congruent");
    }

    @DisplayName("Check if the list is unchanged in case it is invalid: Too much elements.")
    @Test
    void testCheckResultForValidity2() {
        List<Integer> z = new ArrayList<>(Arrays.asList(61));
        assertTrue(Arrays.equals(z.toArray(), Result.gradingStudents(z).toArray()), "Not congruent");
    }

    @DisplayName("Check if grades are rounded correctly (1).")
    @Test
    void testCheckResultForValidity3() {
        List<Integer> z = new ArrayList<>(Arrays.asList(4, 8, 10, 25, 78));
        List<Integer> expected = new ArrayList<>(Arrays.asList(4, 8, 10, 25, 80));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), "Rounded incorrectly");
    }

    @DisplayName("Check if grades are rounded correctly (2).")
    @Test
    void testCheckResultForValidity4() {
        List<Integer> z = new ArrayList<>(Arrays.asList(9, 39, 41, 42, 57, 60, 88, 99, 1, 50));
        List<Integer> expected = new ArrayList<>(Arrays.asList(9, 40, 41, 42, 57, 60, 90, 100, 1, 50));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), "Rounded incorrectly");
    }

    @DisplayName("Check for boundary numbers.")
    @Test
    void testCheckResultForValidity5() {
        List<Integer> z = new ArrayList<>(Arrays.asList(4, 0, 30, 40, 100));
        List<Integer> expected = new ArrayList<>(Arrays.asList(4, 0, 30, 40, 100));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), "Rounded incorrectly");
    }

    @DisplayName("Check for coherent data: # of student matches # of grades")
    @Test
    void testCheckResultForValidity6() {
        List<Integer> z = new ArrayList<>(Arrays.asList(3, 51, 52, 53, 54, 55));
        assertTrue(Arrays.equals(z.toArray(), Result.gradingStudents(z).toArray()), "No match (Students/# of grades)");
    }

}




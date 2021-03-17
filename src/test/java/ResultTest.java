import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ResultTest {

    @BeforeAll
    static void init() {}

    @BeforeEach
    void setUp() {}

    @DisplayName("Checks if the list is unchanged in case it is invalid: Only one element.")
    @Test
    void testCheckResultForValidity1() {
        List<Integer> z = new ArrayList<>(Arrays.asList(5));
        assertTrue(Arrays.equals(z.toArray(), Result.gradingStudents(z).toArray()), "Congruent");
    }

    @DisplayName("Checks if the list is unchanged in case it is invalid: Too much elements.")
    @Test
    void testCheckResultForValidity2() {
        List<Integer> z = new ArrayList<>(Arrays.asList(61));
        assertTrue(Arrays.equals(z.toArray(), Result.gradingStudents(z).toArray()), "Congruent");
    }

    @DisplayName("Checks if grades are rounded correctly (1).")
    @Test
    void testCheckResultForValidity3() {
        List<Integer> z = new ArrayList<>(Arrays.asList(4, 8, 10, 25, 78));
        List<Integer> expected = new ArrayList<>(Arrays.asList(4, 8, 10, 25, 80));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), " Not congruent");
    }

    @Test
    void testCheckResultForValidity4() {
        List<Integer> z = new ArrayList<>(Arrays.asList(8, 39, 41, 42, 57, 60, 88, 99, 1, 50));
        List<Integer> expected = new ArrayList<>(Arrays.asList(8, 40, 41, 42, 57, 60, 90, 100, 1, 50));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), " Not congruent");
    }

}




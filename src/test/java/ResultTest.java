import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        List<Integer> z = new ArrayList<>(Collections.singletonList(5));
        List<Integer> expected = new ArrayList<>(Collections.singletonList(5));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), "Not congruent");
    }

    @DisplayName("Check if the list is unchanged in case it is invalid: Too much elements.")
    @Test
    void testCheckResultForValidity2() {
        List<Integer> z = new ArrayList<>(Collections.singletonList(61));
        List<Integer> expected = new ArrayList<>(Collections.singletonList(61));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), "Not congruent");
    }

    @DisplayName("Check if grades are rounded correctly (1).")
    @Test
    void testCheckResultForValidity3() {
        List<Integer> z = new ArrayList<>(Arrays.asList(4, 8, 10, 25, 78));
        List<Integer> expected = new ArrayList<>(Arrays.asList(8, 10, 25, 80));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), "Rounded incorrectly");
    }

    @DisplayName("Check if grades are rounded correctly (2).")
    @Test
    void testCheckResultForValidity4() {
        List<Integer> z = new ArrayList<>(Arrays.asList(10, 39, 41, 42, 43, 57, 60, 88, 99, 1, 50));
        List<Integer> expected = new ArrayList<>(Arrays.asList(40, 41, 42, 45, 57, 60, 90, 100, 1, 50));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), "Rounded incorrectly");
    }

    @DisplayName("Check for boundary numbers.")
    @Test
    void testCheckResultForValidity5() {
        List<Integer> z = new ArrayList<>(Arrays.asList(5, 0, 30, 40, 55, 100));
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 30, 40, 55, 100));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), "Rounded incorrectly");
    }

    @DisplayName("Check for coherent data: # of student matches # of grades")
    @Test
    void testCheckResultForValidity6() {
        List<Integer> z = new ArrayList<>(Arrays.asList(3, 51, 52, 53, 54, 55));
        assertTrue(Arrays.equals(z.toArray(), Result.gradingStudents(z).toArray()), "No match (Students/# of grades)");
    }

    @DisplayName("Check for coherent data: Empty List")
    @Test
    void testCheckResultForValidity7() {
        List<Integer> z = new ArrayList<>(Collections.emptyList());
        assertTrue(Arrays.equals(z.toArray(), Result.gradingStudents(z).toArray()), "Empty list");
    }

    @DisplayName("Check for coherent data: grades < 0 or > 100")
    @Test
    void testCheckResultForValidity8() {
        List<Integer> z = new ArrayList<>(Arrays.asList(3, -1, 50, 101));
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, -1, 50, 101));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), "Invalid data");
    }

    @DisplayName("test")
    @Test
    void testCheckResultForValidity9() {
        List<Integer> z = new ArrayList<>(Arrays.asList(3, 51, 52, 53, 54, 55));
        ArrayList<Integer> rounded = new ArrayList<>(z);
        assertEquals(z, rounded);
        assertNotSame(z, rounded);
    }



}
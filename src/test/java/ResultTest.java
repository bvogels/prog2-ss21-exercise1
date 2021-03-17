import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
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

    @Test
    void testCheckResultForValidity1() {
        List<Integer> z = new ArrayList<>(Arrays.asList(5));
        assertTrue(Arrays.equals(z.toArray(), Result.gradingStudents(z).toArray()), "Congruent");
    }

    @Test
    void testCheckResultForValidity2() {
        List<Integer> z = new ArrayList<>(Arrays.asList(61));
        assertTrue(Arrays.equals(z.toArray(), Result.gradingStudents(z).toArray()), "Congruent");
    }

    @Test
    void testCheckResultForValidity3() {
        List<Integer> z = new ArrayList<>(Arrays.asList(4, 8, 10, 25, 78));
        List<Integer> expected = new ArrayList<>(Arrays.asList(4, 8, 10, 25, 80));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), " Not congruent");
    }

    @Test
    void testCheckResultForValidity4() {
        List<Integer> z = new ArrayList<>(Arrays.asList(7, 39, 41, 42, 57, 88, 99, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(7, 40, 41, 42, 57, 90, 100, 1));
        assertTrue(Arrays.equals(expected.toArray(), Result.gradingStudents(z).toArray()), " Not congruent");
    }

}




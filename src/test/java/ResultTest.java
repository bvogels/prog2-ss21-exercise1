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
        List<Integer> z = new ArrayList<>(Arrays.asList(1, 5));
        assertTrue(Arrays.equals(z.toArray(), Result.gradingStudents(z).toArray()), "Congruent");


    }

}

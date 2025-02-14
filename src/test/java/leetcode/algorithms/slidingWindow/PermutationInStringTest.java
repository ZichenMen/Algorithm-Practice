package leetcode.algorithms.slidingWindow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {
    @Test
    void testBasicCase() {
        PermutationInString solution = new PermutationInString();
        assertTrue(solution.checkInclusion("ab", "eidbaooo"));
        assertFalse(solution.checkInclusion("ab", "eidboaoo"));
    }
}

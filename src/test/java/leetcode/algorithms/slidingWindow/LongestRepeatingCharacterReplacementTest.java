package leetcode.algorithms.slidingWindow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestRepeatingCharacterReplacementTest {
    @Test
    void testBasicCase() {
        LongestRepeatingCharacterReplacement solution  =new LongestRepeatingCharacterReplacement();
        assertEquals(solution.characterReplacement("ABAB", 2), 4);
    }
}

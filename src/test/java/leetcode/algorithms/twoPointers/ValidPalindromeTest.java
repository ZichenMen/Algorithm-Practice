package leetcode.algorithms.twoPointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeTest {
    @Test
    void testBasicCase() {
        ValidPalindrome solution = new ValidPalindrome();
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(solution.isPalindrome("race a car"));
    }
}

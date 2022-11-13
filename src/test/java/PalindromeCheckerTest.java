import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PalindromeCheckerTest {

    private final String checkedText;
    private final boolean expected;

    public PalindromeCheckerTest(String checkedText, boolean expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{

                {"ala", true},
                {"alan", false},
                {"alla", true},
                {"a", true},
                {"nalla", false},

        };
    }

    @Test
    public void shouldCheckPalindrome() {
        PalindromeChecker calculator = new PalindromeChecker();
        boolean actual = calculator.isPalindrome(checkedText);
        assertEquals(expected, actual);
    }

}

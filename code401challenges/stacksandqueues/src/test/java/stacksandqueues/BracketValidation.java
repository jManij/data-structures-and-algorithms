package stacksandqueues;

import org.junit.Test;
import utilities.MultiBracketValidation;
import static org.junit.Assert.*;

public class BracketValidation {


    @Test
    public void bracketBalanceTest() {
        MultiBracketValidation test = new MultiBracketValidation();
        assertTrue("test 1 failed",test.stringValidation("{}(){}"));
        assertTrue(test.stringValidation("()[[Extra Characters]]"));
        assertTrue(test.stringValidation("(){}[[]]"));
        assertTrue(test.stringValidation("{}{Code}[Fellows](())"));
        assertFalse(test.stringValidation("[({}]"));
        assertFalse(test.stringValidation("(]("));
        assertFalse(test.stringValidation("{(})"));
        assertFalse(test.stringValidation("{]"));
        assertFalse(test.stringValidation("{"));
        assertFalse(test.stringValidation("("));
        assertFalse(test.stringValidation("}{"));
        assertFalse(test.stringValidation(")("));

    }
}

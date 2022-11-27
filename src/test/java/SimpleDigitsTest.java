import dev.failsafe.internal.util.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class SimpleDigitsTest {

    @Test
    void formulaTest() {
        ArrayList<Integer> result = SimpleDigits.formula();
        List<Integer> expected = List.of(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        assertEquals (result, expected);

    }
}

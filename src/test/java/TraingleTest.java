import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TraingleTest {

    @Test
    void formulaTest() {

        double sActual = Triangle.formula(2, 3, 2);
        double sExpected = 1.984313483298443;
        assertEquals(sActual, sExpected, "Wrong");
    }
}

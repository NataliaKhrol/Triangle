import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TraingleTest implements Triangle{

    @Test
    void formulaTest() {

        double a = 2;
        double b = 3;
        double c = 2;
        double pExpected = 3.5;
        double sExpected = 1.98;

        assertEquals(s, sExpected, "Wrong");
        assertEquals(p, pExpected, "Wrong");
    }

}

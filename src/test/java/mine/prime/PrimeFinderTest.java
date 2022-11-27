package mine.prime;

import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

public abstract class PrimeFinderTest {

    PrimeFinder tested = createImpl();

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeNumber() {
        tested.find(0);
    }

    @Test()
    public void negativeNumber2() {
        tested.find(0);
        assertThrows(IllegalArgumentException.class, () -> tested.find(0));
    }

    @Test()
    public void barbarianNegativeNumbers() {
        boolean isExceptionDetected = false;
        try {
            tested.find(0);
        } catch (IllegalArgumentException ex) {
            isExceptionDetected = true;
        }
        assertTrue(isExceptionDetected);
    }

    abstract PrimeFinder createImpl();
}

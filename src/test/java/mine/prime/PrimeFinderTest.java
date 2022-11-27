package mine.prime;

import mine.prime.PrimeFinder;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.internal.junit.ArrayAsserts;

public abstract class PrimeFinderTest {

    PrimeFinder tested = createImpl();

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeNumber() {
        tested.find(0);
    }

    @Test()
    public void barbarianNegativeNumbers() {
         boolean isExceptionDetected = false;
        try {
            tested.find(0);
        } catch (IllegalArgumentException ex) {
            isExceptionDetected = true;
        }
        Assert.assertTrue(isExceptionDetected);
    }


    abstract PrimeFinder createImpl();
}

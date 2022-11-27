package mine.prime;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class PrimeFinderImplTest /*extends PrimeFinderTest*/ {
    PrimeFinder tested = new PrimeFinderImpl();//createImpl();

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeNumber() {
        tested.find(-20);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void zeroNumber() {
        tested.find(0);
    }

    @Test
    void findFirstTenPrimeNumbers() {
        List<Integer> result = tested.find(10);
        //List expected was copied from Wiki
        List<Integer> expected = List.of(1, 2, 3, 5, 7, 11, 13, 17, 19, 23);
        assertEquals(result, expected, "Prime numbers are incorrect");
    }

    @Test
    void findOnePrimeNumber() {
        List<Integer> result = tested.find(1);
        //List expected was copied from Wiki
        List<Integer> expected = List.of(1);
        System.out.println(result);
        assertEquals(result, expected, "Prime number is incorrect");
    }

    @Test
    void findOneHundredPrimeNumbers() {
        final int count = 100;
        List<Integer> result = tested.find(100);
        Set<Integer> resultUniques = new HashSet<>(result);
        assertEquals(resultUniques.size(), 100);
        assertEquals(result.get(99).intValue(), 523); //523 the hundredth prime number found from Wiki
        for (int num : result) {
            for (int i = 2; i < num; i++) {
                assertFalse((num % i == 0), num + " is not prime number");
            }
        }

    }


    @Test()
    public void barbarianZeroNumber() {
        boolean isExceptionDetected = false;
        try {
            tested.find(0);
        } catch (IllegalArgumentException ex) {
            isExceptionDetected = true;
        }
        Assert.assertTrue(isExceptionDetected, "Parameter count must not be zero.");
    }
   /* @Override
    PrimeFinder createImpl() {
        PrimeFinder result = new PrimeFinderImpl();
       return result;
    }
*/
}

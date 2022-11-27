package mine.prime;

public class PrimeFinderImplSlowTest extends PrimeFinderTest {

   @Override
    PrimeFinder createImpl() {
        PrimeFinder result = new PrimeFinderImplSlow();
       return result;
    }

}

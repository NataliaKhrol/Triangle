package mine.prime;

public class PrimeFinderImplFastTest extends PrimeFinderTest {

   @Override
    PrimeFinder createImpl() {
        PrimeFinder result = new PrimeFinderImplFast();
       return result;
    }

}

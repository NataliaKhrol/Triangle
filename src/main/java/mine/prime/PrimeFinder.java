package mine.prime;

import java.util.ArrayList;

public interface PrimeFinder {

    /**
     * Finds the specified quantity of prime numbers.
     *
     * @param count - defines the quantity of prime numbers to be found. Must be greater than zero.
     * @return - returns the list of prime numbers.
     */
     ArrayList<Integer> find(int count);


}

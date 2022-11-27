package mine.prime;

import java.util.ArrayList;

public class PrimeFinderImplFast implements PrimeFinder {
    private ArrayList<Integer> primes;

    public ArrayList<Integer> find(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Count can't be negative.");
        }
        primes = new ArrayList<>();
        primes.add(1);
        if (count == 1) {
            return primes;
        }
        primes.add(2);

        for (int i = 3; primes.size() < count; i+=2) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i < primes.size(); i++) {
            if (num % primes.get(i) == 0) {
                return false;
            }
        }
        return true;
    }

}





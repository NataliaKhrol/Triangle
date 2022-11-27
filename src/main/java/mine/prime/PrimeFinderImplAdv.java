package mine.prime;

import java.util.ArrayList;

public class PrimeFinderImplAdv implements PrimeFinder {
    private ArrayList<Integer> primes;

    public ArrayList<Integer> find(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Count can't be negative.");
        }
        primes = new ArrayList<>();
        primes.add(1);

        for (int i = 2; primes.size() < count; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private boolean isPrime(int num) {
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

}





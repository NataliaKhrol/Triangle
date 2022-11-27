import java.util.ArrayList;

public class DimpleSimple {
    ArrayList<Integer> primes = new ArrayList<Integer>();

    public void a() {
        primes.add(1);
    }

    public void b() {
        System.out.println(primes);
    }

    public static void a(ArrayList<Integer> aPrimes) {
        aPrimes.add(1);
    }

    public static void b(ArrayList<Integer> aPrimes) {
        System.out.println(aPrimes);
    }

    public static void main(String[] args) {
        DimpleSimple ds = new DimpleSimple();
        ds.b();
        ds.a();
        ds.a();
        ds.b();

        ArrayList<Integer> myPrimes = new ArrayList<Integer>();
        b(myPrimes);
        a(myPrimes);
        a(myPrimes);
        b(myPrimes);

        /* ArrayList<Integer> simple = new ArrayList<Integer>();

        simple.add(1);
        simple.add(2);

        topFor:
        for (int i = 3; i <= 1000; i += 2) {
            for (int j = 2; j < simple.size(); j++) {
                if (i % simple.get(j) == 0) {
                    continue topFor;
                }
            }
            simple.add(i);
        }
        System.out.println(simple);
    }*/
    }
}

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Tinkoff6 {

    private static final Set<Long> NUMBERS = new LinkedHashSet<>();

    public static void makeRound(long number) {
        NUMBERS.add(number);
        long max = 0;

        for (long a : NUMBERS) {
            for (long b : NUMBERS) {
                long xor = a ^ b;
                if (xor > max) {
                    max = xor;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            makeRound(scanner.nextLong());
        }
    }
}

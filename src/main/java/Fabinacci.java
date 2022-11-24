import java.util.Arrays;
// Fibanacci till 100;

public class Fabinacci {
    public static void main(String[] args) {
        long[] fabi = new long[101];
        fabi[0] = 1;
        fabi[1] = 1;
        int count = 2;

            for (int i = 2; i <= 100; i++) {
                fabi[i] = fabi[i - 2] + fabi[i - 1];
                count += 1;
            }
            System.out.println(Arrays.toString(fabi));
        }
    }



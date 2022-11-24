import java.util.Arrays;
// Fibanacci till 1000;

public class Fabinacci {
    public static void main(String[] args) {
        int[] fabi = new int[1001];
        fabi[0] = 0;
        fabi[1] = 1;
        int count = 2;
        while (count < 1000) {
            for (int i = 2; i <= 1000; i++) {
                fabi[i] = fabi[i - 2] + fabi[i - 1];
                count += 1;
            }
            System.out.println(Arrays.toString(fabi));
        }
    }
}


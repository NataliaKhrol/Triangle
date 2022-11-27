import java.util.ArrayList;

public class Simple {
    public static void main(String[] args) {
        ArrayList<Integer> simple = new ArrayList<Integer>();
        simple.add(1);
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count > 1) {
                count = 0;
                continue;

            }else if (count<=1) {
                simple.add(i);
                count = 0;
            }
        }
        System.out.println(simple);
    }
}

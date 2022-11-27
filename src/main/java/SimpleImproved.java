import java.util.ArrayList;

public class SimpleImproved {
    public static void main(String[] args) {
        ArrayList<Integer> simple = new ArrayList<Integer>();
        simple.add(1);

        topFor:
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue topFor;
                }
            }
            simple.add(i);
        }
            System.out.println(simple);
    }
}

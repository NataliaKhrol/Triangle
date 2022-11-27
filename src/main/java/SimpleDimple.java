import java.util.ArrayList;

public class SimpleDimple {
    public static void main(String[] args) {
        ArrayList<Integer> simple = new ArrayList<Integer>();
        simple.add(1);
        simple.add(2);

        topFor:
        for (int i = 3; i <= 1000; i+=2) {
            for (int j = 2; j < simple.size(); j++) {
                if (i % simple.get(j) == 0) {
                    continue topFor;
                }
            }
            simple.add(i);
        }
        System.out.println(simple);
    }
}

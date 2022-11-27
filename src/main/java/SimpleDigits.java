import java.util.ArrayList;

public class SimpleDigits {
    public static void main(String[] args) {
        ArrayList<Integer> simple = new ArrayList<Integer>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        simple.add(5);
        simple.add(7);
        int s = 11;
        for (int i = 0; i <= 1000; i++) {
            if (s % 2 != 0 & s%3!=0 & s %5 != 0 & s%7!=0 & s%9!=0) {
                simple.add(s);
            }
                s = s+2;
        }
            System.out.println(simple);
    }
}

      /*  int[] simple = new int[1000];
        simple[0] =1;
        for (int i = 1; i <=1000; i++){
            if (simple[i] / 1 & simple[i]/simple[i]) {*/
// }
//}

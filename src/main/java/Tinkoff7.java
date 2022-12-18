import java.util.Scanner;

public class Tinkoff7 {
    public static void main(String[] args) {
        System.out.println("Enter any digit more than -32000 and less than 32000: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(b + a);
    }
}

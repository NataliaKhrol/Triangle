import io.qameta.allure.Step;

import java.util.Random;

public class Triangle {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(formula(random.nextInt(11), random.nextInt(11), random.nextInt(11)));
    }

    @Step("finding the area of a triangle on three sides")
    public static double formula(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}

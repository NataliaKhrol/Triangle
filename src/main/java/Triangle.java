import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import java.util.Random;

@Log4j2
public class Triangle {

    @Step("finding the area of a triangle on three sides")
    public static double formula(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            log.error("значение сторон не может принимать 0 или меньше 0");
            throw new RuntimeException("The side of the triangle must be positive");
        }

        double p = (a + b + c) / 2;
        log.info("находим полупериметр треугольника '{}'", p);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        log.info("находим площадь треугольника '{}'", s);
        return s;
    }
}

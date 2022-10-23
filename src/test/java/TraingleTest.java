import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class TraingleTest {

    @Test
    void formulaTest() {
        final double delta = 0.000_000_001;
        double sActual = Triangle.formula(2, 3, 2);
        double sExpected = 1.98431348329844;
        assertEquals(sActual, sExpected, delta, "Wrong");
    }

    @Test(expectedExceptions = {RuntimeException.class})
    void negativeNumberTest() {

        Triangle.formula(-2, 3, 2);
    }
}



       /* log.fatal("НИЧЕГО НЕ РАБОТАЕТ");
        log.error("ЧТО-ТО НЕ РАБОТАЕТ");
        log.warn("ЧТО-ТО МОЖЕТ НЕ РАБОТАТЬ, НО ПОКА ОК");
        log.info("ИНФА");
        log.debug("ЭТА ИНФА ПОМОЖЕТ ТЕБЕ НАЙТИ ПРОБЛЕМУ");
        log.trace("ПОДРОБНАЯ ИНФА ДЛЯ ДЕБАГА");

        @Test
        void mlA() {

        double a =4.35;
        double b = 100;
        final double delta = 0.000_000_001;
        double c = a*b;
        assertEquals(435, delta, c);
    }
        */

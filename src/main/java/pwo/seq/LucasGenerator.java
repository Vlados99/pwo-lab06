package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa odpowiedzialna za generowanie ciągu Lucasa. Rozszerza możliwości klasy
 * odpowiedzialnej za generowanie wyrazów ciągu Fibonacciego
 *
 * @author Vladyslav Veshnevskyi
 * @version 1.0.0
 */
public class LucasGenerator extends FibonacciGenerator {

    /**
     * Konstruktor klasy, który przypisuje zmiennym dla ciągu Lucasa początkowe
     * wartości.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}

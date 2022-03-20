package Unit1.JavaBasics.Polymorphism.TaskFromAccountant;

import java.math.BigDecimal;

class TaxService {
    public void payOut(BigDecimal taxAmount) {
        System.out.printf("Have been payed %.2f%n ", taxAmount);
    }
}

package Unit1.JavaBasics.Polymorphism.TaskFromAccountant;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    public double calculateTaxFor(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(amount.subtract(BigDecimal.valueOf(100000)).doubleValue() <= 0 ? 0.1 : 0.15)).doubleValue();
    }
}

package Unit1.JavaBasics.Polymorphism.TaskFromAccountant;

import java.math.BigDecimal;

public class VATaxType extends TaxType {
    public double calculateTaxFor(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.18)).doubleValue();
    }
}

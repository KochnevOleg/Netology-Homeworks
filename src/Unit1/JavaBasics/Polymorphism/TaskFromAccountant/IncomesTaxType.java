package Unit1.JavaBasics.Polymorphism.TaskFromAccountant;

import java.math.BigDecimal;

public class IncomesTaxType extends TaxType {
    public double calculateTaxFor(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.13)).doubleValue();
    }
}

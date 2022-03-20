package Unit1.JavaBasics.Polymorphism.TaskFromAccountant;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        TaxType incomesTax = new IncomesTaxType();
        TaxType vaTax = new VATaxType();
        TaxType progressiveTax = new ProgressiveTaxType();
        Bill[] bills = new Bill[3];
        bills[0] = new Bill(BigDecimal.valueOf(40561), incomesTax, taxService);
        bills[1] = new Bill(BigDecimal.valueOf(63490), vaTax, taxService);
        bills[2] = new Bill(BigDecimal.valueOf(130045), progressiveTax, taxService);

        for (Bill bill : bills) {
            bill.payTaxes();
        }
    }
}

package Unit4.TaxServiceReport;

import java.util.Random;

public class Shop {

    public long generateEarnings () {
        long dailyEarnings = 0;
        long[] earnings = new long[new Random().nextInt(50)];
        for (int i = 0; i < earnings.length; i++) {
            earnings[i] = new Random().nextLong(5000);
            dailyEarnings += earnings[i];
        }
        return dailyEarnings;
    }
}

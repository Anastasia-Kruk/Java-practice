package by.stormnet_hw.hw_9;

public class UserConversion implements Converter {
    double inSum;
    Currency currency;

    public UserConversion(double inSum, Currency currency) {
        this.inSum = inSum;
        this.currency = currency;
    }

    @Override
    public void conversion() {
        System.out.println(inSum + " " +  currency.rusName + " = " + inSum*currency.exchangeRates + " (Белорусских рублей).");
    }
}

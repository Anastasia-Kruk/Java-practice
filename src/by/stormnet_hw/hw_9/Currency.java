package by.stormnet_hw.hw_9;

public enum Currency {
    USD(2.0797, "Долларов США"),
    EUR(2.3158, "Евро");

    double exchangeRates;
    String rusName;

    Currency(double exchangeRates, String rusName) {
        this.exchangeRates = exchangeRates;
        this.rusName = rusName;
    }

    public double getExchangeRates() {
        return exchangeRates;
    }

    public String getRusName() {
        return rusName;
    }
}



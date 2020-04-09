package main;

import java.util.HashMap;
import java.util.Map;

public class ExchangeBureau {

    private String baseCurrency;
    private Map<String, ExchangeRate> exchangeRates;

    public ExchangeBureau(){
        this.baseCurrency = "EUR";
        this.exchangeRates = new HashMap<>();
        this.exchangeRates.put("USD", new ExchangeRate("USD", 0.92, 1.09));
        this.exchangeRates.put("YEN", new ExchangeRate("YEN", 0.0084, 118.36));
        this.exchangeRates.put("KES", new ExchangeRate("KES", 0.0087, 115.62));
    };

    public ExchangeBureau(String baseCurrency, Map<String, ExchangeRate> exchangeRates){
        this.baseCurrency = baseCurrency;
        this.exchangeRates = exchangeRates;
    }

    public void setExchangeRates(Map<String, ExchangeRate> exchangeRates) {
        this.exchangeRates = exchangeRates;
    }

    public Map<String, ExchangeRate> getExchangeRates() {
        return exchangeRates;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }
}

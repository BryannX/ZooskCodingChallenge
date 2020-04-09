package main;

public class Teller {

    ExchangeBureau bureau;

    public Teller(){
        this.bureau = new ExchangeBureau();
    }

    public Money buyCurrency(Money amount, String currency){

        //Mocks an external API call for the current exchange rate for the requested currency
        double rate = bureau.getExchangeRates().get(currency).getSelling();

        return Money.convertTo(amount, currency, rate);

    }

    public Money buyBaseCurrency(Money amount){

        String currency = amount.getCurrency();
        //Mocks an external API call for the current exchange rate for the requested baseCurrency
        double rate = bureau.getExchangeRates().get(currency).getBuying();

        return Money.convertTo(amount, bureau.getBaseCurrency(), rate);

    }

}

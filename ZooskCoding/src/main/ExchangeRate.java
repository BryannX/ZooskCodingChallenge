package main;

public class ExchangeRate {

    private String currency;
    private double buying;
    private double selling;

    public ExchangeRate(String currency, double buying, double selling){
        this.currency = currency;
        this.buying = buying;
        this.selling = selling;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setBuying(double buying) {
        this.buying = buying;
    }

    public double getBuying() {
        return buying;
    }

    public void setSelling(double selling) {
        this.selling = selling;
    }

    public double getSelling() {
        return selling;
    }
}

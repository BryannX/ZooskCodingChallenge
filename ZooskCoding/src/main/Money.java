package main;

public class Money {

    private double amount;
    private String currency;

    public Money(String currency, double amount){
        this.amount = amount;
        this.currency = currency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    //Equals
    public static boolean isEquals(Money amount1, Money amount2, double rate){

        double convertedAmount1 = amount1.amount * rate;

        return convertedAmount1 == amount2.amount;

    }

    //Conversion
    public static Money convertTo(Money target, String currency, double rate){

        double convertedAmount = target.amount * rate;
        target.setCurrency(currency);
        target.setAmount(convertedAmount);

        return target;

    };

    //Add/Subtract
    public static Money add(Money amount1, Money amount2, double rate){

        double convertedAmount1 = amount1.amount * rate;
        double amountSum = convertedAmount1 + amount2.amount;
        Money result = new Money(amount2.currency, amountSum);

        return result;

    };

    public static Money subtract(Money amount1, Money amount2, double rate){

        double convertedAmount1 = amount1.amount * rate;
        double amountSum = convertedAmount1 - amount2.amount;
        Money result = new Money(amount2.currency, convertedAmount1);

        return result;

    };

    //Comparison GT/LT
    public static boolean isGreaterThan(Money amount1, Money amount2, double rate){

        double convertedAmount1 = amount1.amount * rate;

        return convertedAmount1 > amount2.amount;
    };
}

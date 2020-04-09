package main;

public class Application {

    public static void printMoney(User user, Money amount, Money newAmount){
        String userName = user.getUserName();
        String initialAmount = amount.getCurrency() + " " + amount.getAmount();
        String convertedAmount = newAmount.getCurrency() + " " + newAmount.getAmount();

        System.out.println(userName +  " has converted " +  initialAmount + " to " + convertedAmount);

    }

    public static void main(String[] args){
        
        Money initialAmount1 = new Money("EUR", 100.00);
        Money initialAmount2 = new Money("USD", 130.89);
        Money initialAmount3 = new Money("KES", 1234.38);

        User user1 = new User("John", new Money("EUR", 100.00));
        User user2 = new User("Jane", new Money("USD", 130.89));
        User user3 = new User("Alex", new Money("KES", 1234.38));

        Teller teller1 = new Teller();

        Money convertedMoney1 = teller1.buyCurrency(user1.getMoney(), "USD");
        Money convertedMoney2 = teller1.buyBaseCurrency(user2.getMoney());
        Money convertedMoney3 = teller1.buyBaseCurrency(user3.getMoney());

        printMoney(user1, initialAmount1, user1.getMoney());
        printMoney(user2, initialAmount2, user2.getMoney());
        printMoney(user3, initialAmount3, user3.getMoney());




    }
}

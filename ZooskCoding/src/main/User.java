package main;

public class User {

    private String userName;
    private Money money;

    public User(String userName, Money money){
        this.userName = userName;
        this.money = money;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public Money getMoney() {
        return money;
    }
}

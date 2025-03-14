package bank;

public class Account {
    private int pin;
    protected double balance;
    protected String name;

    public Account(String name, int pin, double balance){
        this.pin = pin;
        this.balance = balance;
        this.name = name;
    }
    public String toString(){
        String result = "$" + balance + " " + name;
        return result;
    }
}

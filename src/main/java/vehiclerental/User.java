package vehiclerental;

public class User {
    private String name;
    private String email;
    private int balance;

    public void reduceBalance(int amount){
        balance -= amount;
    }
}

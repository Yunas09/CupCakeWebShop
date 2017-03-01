

public class User {
private String userName, passWord;
private double balance;
    
public User(String userName, String passWord, double balance)
{
    this.userName = userName;
    this.passWord = passWord;
    this.balance = balance;
    
}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}


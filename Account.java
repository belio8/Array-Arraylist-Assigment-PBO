public class Account {
    private double balance;
    public Account(){
        this.balance = 0;
    }
    public Account(double balance){
        this.balance = balance;
    }

    public void setBalance(double balance){this.balance = balance;}
    public double getBalance(){return this.balance;}
    public double withdraw(double nominal){
        if(this.balance - nominal < 0){
            return 0;
        }
        this.balance -= nominal;
        return nominal;
    }
    public double deposit(double nominal){
        this.balance += nominal;
        return nominal;
    }
}

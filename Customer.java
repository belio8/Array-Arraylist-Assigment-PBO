public class Customer {
    private String firstName, lastName;
    private Account account;
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = new Account();
    }
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public Account getAccount(){return this.account;}
}
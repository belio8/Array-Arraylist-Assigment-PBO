public class Bank{
    private Customer[] customers;
    private int totalCustomer;
    public Bank(){
        this.customers = new Customer[20];
        this.totalCustomer = 0;
    }
    public void addCustomer(String firstName, String lastName){
        Customer customer = new Customer(firstName, lastName);
        this.customers[this.totalCustomer] = customer;
        this.totalCustomer++;
    }
    public Customer getCustomer(int index){
        return this.customers[index];
    }
    public int getTotalCustomer(){
        return this.totalCustomer;
    }

}   
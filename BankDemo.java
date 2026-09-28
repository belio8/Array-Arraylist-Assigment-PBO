public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Ridho", "Kurniawan");
        bank.addCustomer("Ridho", "Hidayat");
        bank.addCustomer("Abel", "Devara");

        for (int i = 0; i < bank.getTotalCustomer(); i++) {
            Customer customer = bank.getCustomer(i);
            customer.getAccount().deposit(1000000);
            System.out.printf("Customer %d: %s %s, Balance: Rp. %.2f%n", i + 1, customer.getFirstName(), customer.getLastName(), customer.getAccount().getBalance());
        }
        System.out.println();
        Customer customer1 = bank.getCustomer(0);
        Customer customer2 = bank.getCustomer(1);
        Customer customer3 = bank.getCustomer(2);
        System.out.printf("Customer %-3d: %s %s%nWithdraw %-3s: Rp. %.2f%nBalance%-5s: Rp. %.2f%n",
         1, customer1.getFirstName(), customer1.getLastName(), ' ',customer1.getAccount().withdraw(50000), ' ',customer1.getAccount().getBalance());
        System.out.printf("Customer %-3d: %s %s%nWithdraw %-3s: Rp. %.2f%nBalance%-5s: Rp. %.2f%n",
         2, customer2.getFirstName(), customer2.getLastName(), ' ',customer2.getAccount().withdraw(200000), ' ',customer2.getAccount().getBalance());
        System.out.printf("Customer %-3d: %s %s%nWithdraw %-3s: Rp. %.2f%nBalance%-5s: Rp. %.2f%n",
         3, customer3.getFirstName(), customer3.getLastName(), ' ',customer3.getAccount().withdraw(100000), ' ',customer3.getAccount().getBalance());
    }
}

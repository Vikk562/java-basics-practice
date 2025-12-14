public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        //constructor overloading
        // constructor chaining example
        this(4378382, 43984333.493, "Stephen", "stephen@email.com", "4384398443");
        System.out.println("Empty constructor is initiated: ");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Account Constructor with parameters is called");
        this.accountNumber = accountNumber;
        //setAccountNumber(accountNumber); ---> another way of doing it
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 384943.00, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber; ---> not required as it is done at the 5 parameter constructor
        //this constructor can be called using the new keyword along with only these params
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {

        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            System.out.println("Phone number must be 10 digits");
            throw new IllegalArgumentException("Phone number must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double number) {
        this.accountBalance  = this.accountBalance + number;
    }

    public void withdrawFunds (double number) {
        this.accountBalance = this.accountBalance - number;
    }

}

public class Main {


    public static void main (String[] args) {


        BankAccount person1 = new BankAccount();
        person1.setAccountNumber(123456);
        person1.setCustomerName("abc");
        person1.setAccountBalance(238498.909);
        person1.setEmail("abc@gmail.com");
        person1.setPhoneNumber("0123456789");

        System.out.println("The account balance is " + person1.getAccountBalance());
        person1.depositFunds(44000.76);
        System.out.println("The account balance is " + person1.getAccountBalance());


        // initializing values into a new instance using a constructor
        BankAccount person2 = new BankAccount(98392, 4387382.238, "James", "james@email.com", "2398732983");
        System.out.println(person2.getAccountNumber());
        System.out.println(person2.getAccountBalance());
        System.out.println(person2.getCustomerName());
        person2.withdrawFunds(348392.3948);
        System.out.println(person2.getAccountBalance());


        System.out.println("----------------------------------" +
                "This is the example of constructor chaining-----------------------");
        BankAccount person3 = new BankAccount();
        //Since we have no parameters we are calling the 5 parameter constrcutor from the default constructor

        System.out.println(person3.getAccountNumber());
        System.out.println(person3.getAccountBalance());



        System.out.println("-----------------------Tim's account" +
                "-------------------------------------");
        BankAccount timAccount = new BankAccount("Tim", "tim@email.com", "3892829889");
        System.out.println(timAccount.getAccountNumber());
        System.out.println(timAccount.getAccountBalance());



    }
}

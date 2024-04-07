class Account{
    // Class Constructor
    public Account(String accountNumber, String name, String address, String phoneNumber, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }
    private String accountNumber;
    private String name;
    private String address;
    private String phoneNumber;
    private double balance;
    // private String dateOfBirth;

    // Getter and Setter Method
    public void setAccountNumber(String ACCOUNTNUMBER){
        accountNumber = ACCOUNTNUMBER;
    }
    public void setName(String NAME){
        name = NAME;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String ADDRESS){
        address = ADDRESS;
    }
    public void setPhoneNumber(String PHONENUMBER){
        phoneNumber = PHONENUMBER;
    }
    private void setBalance(double BALANCE){
        balance=BALANCE;
    }

}
public class StudentChallenge1 {

}

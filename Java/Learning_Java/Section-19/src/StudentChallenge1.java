// Congrats to crack this!
class ATM{
    synchronized public void checkBalance(String name){
        System.out.println(name+" is checking the balance...");
        System.out.println("Balance is xxx");
    }

    synchronized public void withdraw(int amount){
        System.out.println("Withdrawing the amount...");
        System.out.println(amount+" is being withdraw");
    }
}

class Customer extends Thread{
    ATM atm;
    String name;
    int amount;
    public Customer(String name, int amount, ATM reference){
        atm = reference;
        this.amount = amount;
        this.name = name;
    }
    public void run(){
        atm.checkBalance(name);
        atm.withdraw(amount);
    }
}

public class StudentChallenge1 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c2 = new Customer("Aryan",2000,atm);
        Customer c1 = new Customer("Kunjesh",1000,atm);
        c1.start();
        c2.start();
    }
}

class ATM2{
    synchronized public void checkBalance(String name){
        System.out.println("Name of Customer: "+ name);
    }
    synchronized public void withdraw(String name, int amount){
        System.out.println("Name of Customer: "+ name + " Withdraw amount: "+ amount);
    }
}


class Customer2 extends Thread{
    ATM2 atm;
    public String name;
    public int amount;


    Customer2(String name, int amount, ATM2 x) {
        this.name = name;
        this.amount = amount;
        atm = x;
    }



    public void run(){
        atm.checkBalance(name);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        atm.withdraw(name, amount);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }






}









public class StudentChallenge {

    public static void main(String[] args) {


        ATM2 newATM = new ATM2();

        Customer2 cust2 = new Customer2("Aryan", 5000, newATM);
        Customer2 cust = new Customer2("Kunjesh", 3000, newATM);


        cust.start();
        cust2.start();



    }
}


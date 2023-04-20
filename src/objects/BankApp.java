package objects;

import java.security.spec.RSAOtherPrimeInfo;

//
class BankAccount{
    public int balance;

    public BankAccount(int init){
        balance = init;
    }
    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
    public void display(){
        System.out.println("Balance :"+balance);
    }
}
public class BankApp {
    public static void main(String[] args) {
        //create a bankaccount
        BankAccount ba1= new BankAccount(1000);
        System.out.println("Before transactions ,");
        ba1.display();

        ba1.deposit(200);
        ba1.withdraw(100);

        System.out.println("after transactoins , ");
        ba1.display();
    }
}

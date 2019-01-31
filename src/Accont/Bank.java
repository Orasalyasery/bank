package Accont;

import java.util.Scanner;

class bankInternal {
    int account;
    float balance=0;
    Scanner get = new Scanner(System.in);
    bankInternal()
    {
        System.out.println("Enter Account Number:");
        account = get.nextInt();
        System.out.println("Enter Initial Balance:");
        balance = get.nextFloat();        
    }
    void deposit()
    {
        float amount;
        System.out.println("Enter Amount to be Deposited:");
        amount = get.nextFloat();
        balance = balance+amount;
        System.out.println("Deposited! Account Balance is "+balance);
    }
    void withdraw()
    {
        float amount;
        System.out.println("Enter Amount to be Withdrawn:");
        amount = get.nextFloat();
        if(amount<balance)
        {
        	balance = balance-amount;
            System.out.println("Amount Withdrawn!! Available Balance: "+balance);
        }
        else
        {
            System.out.println("Insufficient funds!!");
        }
    }
}

public class Bank {
    public static void main(String[] args)
    {
        bankInternal myObj = new bankInternal();
        myObj.deposit();
        myObj.withdraw();       
    }
}

package bank;

import java.util.Scanner;
/**
 * 
 * @author Shriya
 */

public class Amount {
    /**
     * initialization of variables and arrays
     */
     float balance;
    int i;
    int count=1;
     int acc_no[]=new int[10];
     String name[]=new String[10];
     String phone_no[]=new String[10];
     float amt[]=new float[10];
      Scanner inp=new Scanner(System.in);
      /**
       * this constructor is used to initialize the balance with the initial amount 
       * @param amt to initialize the balance with amount
       */
    public Amount(float amt)
    {
        balance=amt;
    }
    /**
     * this method is used to deposit the specified amount in the bank account
     * @param amt  holds the amount to be deposited in the bank account
     */
    public int deposit(float amt)
    {
        balance+=amt;
        return (int)balance;
    }
    /**
     * this method is used to withdraw money from the bank account by specifying the amount to be withdrawn
     * the amount specified must be less then 500 as there should be minimum of 500 rupees in the account
     * @param amt holds the amount to withdraw from the bank account
     */
    public int Withdraw(float amt)
    {
       
        if(amt>500)
        {
        balance-=amt;
        }
        else
        {
            System.out.println("Insufficient amount");
        }
        return (int)balance;
    }
    /**
     * this method is called for creating new accounts in the bank by entering the customer details
     * @param acc holds the account number for creating new account
     */
    public void create(int acc)
    {
       
      acc_no[count]=acc;
       
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter your name:");
        name[count]=inp.next();
       
        System.out.println("Enter your phone_no.:");
        phone_no[count]=inp.next();
        
        do{
            System.out.println("Enter the initial amount");
            amt[count]=inp.nextFloat();
        }while(amt[count]<500);
      count++;
    }
    
   /**
    * this method displays the balance amount present in the bank account
    */
    public int display()
    {
        System.out.println("balance is"+balance);
        return (int)balance;
    }
}


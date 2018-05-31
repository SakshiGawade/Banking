
package bank;

import java.util.Scanner;


class Amount {
     float balance;
    int i;
    int count=1;
     int acc_no[]=new int[10];
     String name[]=new String[10];
     String phone_no[]=new String[10];
     float amt[]=new float[10];
      Scanner inp=new Scanner(System.in);
    Amount(float amt)
    {
        balance=amt;
    }
    
    void deposit(float amt)
    {
        balance+=amt;
    }
    
    void Withdraw(float amt)
    {
        if(amt>500)
        {
        balance-=amt;
        }
        else
        {
            System.out.println("Insufficient amount");
        }
    }

    void create(int acc)
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
    
    void display()
    {
        System.out.println("balance is"+balance);
    }
}


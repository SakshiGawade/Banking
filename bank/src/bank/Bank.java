
package bank;

import java.util.Scanner;


public class Bank {

   
    public static void main(String[] args) {
         float amt = 0;
        Scanner inp=new Scanner(System.in);
        
        Amount b1=new Amount(amt);
        Exit:
       while(true)
       {
        System.out.println("1.Create account\n 2.Deposited\n 3.Withdraw\n 4.Display\n 5.Exit");
        System.out.println("Enter your choice:");
        int ch=inp.nextInt();
        
        switch(ch)
        {
            case 1:System.out.println("Enter the acc_no:");
                    int acc=inp.nextInt();
                        b1.create(acc);
                        break;
                    
            case 2:System.out.println("Enter the amount to be deposited");
                     amt=inp.nextFloat();
                    b1.deposit(amt);
                        break;
                        
            case 3:System.out.println("Enter the amount to be withdrawed:");
                    amt=inp.nextFloat();
                    b1.Withdraw(amt);
                    break;
                    
            case 4: b1.display();
                    break;
                    
            case 5:break Exit;
          
        }
    }
    }
}

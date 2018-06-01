/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author Shriya
 */
public class test_bank {
     Amount a;
    
    public test_bank() {
        float amt=10000;
        this.a=new Amount(amt);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
     public void test_deposit() {
      assertEquals(12500,a.deposit(2500));
          assertEquals(13500,a.deposit(1000));
          assertEquals(14000,a.deposit(500));
         
     }
     
     @Test
     public void test_Withdraw() {
          assertEquals(9400,a.Withdraw(600));
          assertEquals(8600,a.Withdraw(800));
          assertEquals(7600,a.Withdraw(1000));
         
     }
     
     @Test
     public void test_Withdraw_display() {
         assertEquals(9400,a.Withdraw(600));
          assertEquals(9400,a.display());
          assertEquals(8600,a.Withdraw(800));
          assertEquals(8600,a.display());
         assertEquals(7600,a.Withdraw(1000));
          assertEquals(7600,a.display());
         
         
     }
     
     @Test
     public void test_deposit_display() {
          assertEquals(12500,a.deposit(2500));
          assertEquals(12500,a.display());
          assertEquals(13500,a.deposit(1000));
          assertEquals(13500,a.display());
          assertEquals(14000,a.deposit(500));
          assertEquals(14000,a.display());
         
         
     }
     
     @Test
     public void test_deposit_withdraw_display() {
          assertEquals(12500,a.deposit(2500));
          assertEquals(12500,a.display());
          assertEquals(11500,a.Withdraw(1000));
          assertEquals(11500,a.display());
          assertEquals(12000,a.deposit(500));
          assertEquals(12000,a.display());
          assertEquals(11400,a.Withdraw(600));
          assertEquals(11400,a.display());
         
         
     }
}

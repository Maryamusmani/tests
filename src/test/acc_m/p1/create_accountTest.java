package p1;

import org.junit.Before;
import org.junit.Test;
import p1.create_account;
import org.junit.Assert;


public class create_accountTest {
    create_account obj1;
     @Before
     public void a1(){
         obj1 = new create_account("amna", 1234, 25000, "savings",25000);

     }
    @Test
    public void insert() {
         Assert.assertEquals("amna",obj1.getName());
        Assert.assertEquals(1234,obj1.getAccountNum());
        Assert.assertEquals(25000,obj1.getAccountBalance(),0.0001);
        Assert.assertEquals("savings",obj1.getAccountType());
     }

    @Before
    public void a2(){
        obj1 = new create_account("amna", 1234, 25000, "savings",25000);
     }
    @Test
    public void Deposite() {
        Assert.assertEquals(1234,obj1.getAccountNum());
        Assert.assertEquals(25000,obj1.getMoney());
     }

    @Before
    public void a3(){
        obj1 = new create_account("amna", 1234, 25000, "savings",25000);
    }
    @Test
    public void withdraw() {
        Assert.assertEquals(1234,obj1.getAccountNum());
        Assert.assertEquals(25000,obj1.getMoney());
    }
    @Before
    public void a4(){
        obj1 = new create_account("amna", 1234, 25000, "savings",25000);
    }
    @Test
    public void zakat() {
        Assert.assertEquals(1234,obj1.getAccountNum());
        Assert.assertEquals(25000,obj1.getMoney());
    }
}
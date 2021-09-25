package p1;

import p1.account;

public class create_account extends account {
    create_account(String n,int aNum,int b,String at,int mo){ // pass name and p1.account type
        name=n;
        accountNum=aNum;
        accountBalance=b;
        accountType=at;
        money = mo;
    }

    void insert(String n,int aNum,String at){ // input user name, p1.account number and type
        name=n;
        accountType=at;
        accountNum=aNum; // generate random number
        accountBalance=0;
    }
    public void setName(String n)
    {
        name = n;

    }
    public String getName()
    {
        return name;
    }
    public void setAccountType(String at)
    {
        accountType = at;

    }
    public String getAccountType()
    {
        return accountType;
    }
    public void setAccountNum(int an)
    {
        accountNum = an;

    }
    public int getAccountNum() {
        return accountNum;
    }
    public void setAccountBalance(int b)
    {
        accountBalance = b;

    }
    public double getAccountBalance() {
        return accountBalance;
    }


        void display_details(){
        System.out.println("Depositor Name :" +name);
        System.out.println("Account Number : "+accountNum);
        System.out.println("Account Balance : "+accountBalance);
        System.out.println("Account Type : "+accountType);
    }

    void Deposite(int accountNum,int money){
        accountBalance=money;
    }
    public void setMoney(int mo){
        money = mo;
    }
    public int getMoney(){
        return money;
    }


    double withdraw(double withDraw){
        accountBalance=accountBalance-withDraw;
        return accountBalance;
    }

    void zakat() {
        accountBalance= accountBalance*2.5/100;
    }
} // end class



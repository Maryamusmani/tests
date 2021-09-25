package p1;

public class account {
    String name,accountType;
    int accountNum;
    double accountBalance;
    int money;
    account(){

    }
    account(String n,int aNum,int b,String at ,int mo){
        name=n;
        accountNum=aNum;
        accountBalance=b;
        accountType=at;
        money = mo;
    }
}

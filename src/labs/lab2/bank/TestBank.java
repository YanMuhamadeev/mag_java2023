package labs.lab2.bank;

public class TestBank {
    public static void main(String[] args) {
        Account acc1 = new Account("3412412321",1000);
        Account acc2 = new Account("45435353",1000);

        acc1.doTransactionAcc(500,acc2);
        acc1.getCurrentMoney();
        acc2.getCurrentMoney();
    }
}

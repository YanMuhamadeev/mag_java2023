package labs.lab2.bank;

public interface IAccount {
    Account createNewAcc(String newAcc);
    void doTransactionAcc(double money, Account acc);
}

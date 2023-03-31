package labs.lab2.bank;

public class Account implements IAccount{
    private double money;
    private String acc;

    public Account(String acc, double money) {
        this.acc = acc;
        this.money = money;
    }

    public String getAcc() {
        return "" + acc;
    }

    public void setDeposite(double money) {
        this.money +=money;
    }

    public void getMoney(double money) {
        if(money < this.money) {
            System.out.println("Недостаточно средств");
        } else {
            this.money -= money;
        }
    }

    public void getCurrentMoney() {
        System.out.println("На вашем балансе: " + money);
    }

    @Override
    public Account createNewAcc(String newAcc) {
        Account acc = new Account(newAcc,money);
        return acc;
    }

    @Override
    public void doTransactionAcc(double money, Account acc) {
        if(money < this.money) {
            System.out.println("Перевод на счет #" + acc.getAcc() + " " + money + " рублей");
            acc.setDeposite(money);
            this.money -= money;
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}

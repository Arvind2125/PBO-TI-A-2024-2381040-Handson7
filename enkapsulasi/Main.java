package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount ArvindFerbriano = new BankAccount(100);

        ArvindFerbriano.withdraw(10);
        System.out.println("Current balance is: " + ArvindFerbriano.getBalance());
    }
}

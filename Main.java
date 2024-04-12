import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Add some sample accounts
        bank.addAccount(new Account(12345, 1000, "John Doe"));
        bank.addAccount(new Account(67890, 500, "Jane Smith"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Transfer funds");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter from account number: ");
                    int fromAccountNumber = scanner.nextInt();
                    System.out.print("Enter to account number: ");
                    int toAccountNumber = scanner.nextInt();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();

                    if (bank.transferFunds(fromAccountNumber, toAccountNumber, amount)) {
                        System.out.println("Transfer successful.");
                    } else {
                        System.out.println("Transfer failed.");
                    }
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
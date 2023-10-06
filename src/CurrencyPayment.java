import java.util.*;

public class CurrencyPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input of the size of currency denominations
        System.out.print("Enter the size of currency denominations: ");
        int size = scanner.nextInt();
        
        // Take input of the currency denominations
        System.out.println("Enter the currency denominations value:");
        int[] denominations = new int[size];
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }
        
        // Take input of the amount to be paid
        System.out.print("Enter the amount to be paid: ");
        int amount = scanner.nextInt();
        
        // Sort the denominations in descending order
        Arrays.sort(denominations);
        
        // Calculate and print the minimum number of notes required
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i = size - 1; i >= 0; i--) {
            if (amount >= denominations[i]) {
                int count = amount / denominations[i];
                System.out.println(denominations[i] + ":" + count);
                amount %= denominations[i];
            }
            if (amount == 0) {
                break;
            }
        }
    }
}
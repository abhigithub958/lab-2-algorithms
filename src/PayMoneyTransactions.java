import java.util.*;

public class PayMoneyTransactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input of the size of transaction array
        System.out.print("Enter the size of transaction array: ");
        int size = scanner.nextInt();
        
        // Take input of the transaction values
        System.out.println("Enter the values of array:");
        int[] transactions = new int[size];
        for (int i = 0; i < size; i++) {
            transactions[i] = scanner.nextInt();
        }
        
        // Take input of the total number of targets to be achieved
        System.out.print("Enter the total number of targets that need to be achieved: ");
        int numTargets = scanner.nextInt();
        
        // Process each target and find when it is achieved
        for (int t = 1; t <= numTargets; t++) {
            // Take input of the target value
            System.out.print("Enter the value of target: ");
            int target = scanner.nextInt();
            
            // Find when the target is achieved
            int sum = 0;
            int transactionsNeeded = -1;
            for (int i = 0; i < size; i++) {
                sum += transactions[i];
                if (sum >= target) {
                    transactionsNeeded = i + 1;
                    break;
                }
            }
            
            // Print whether the target is achieved or not
            if (transactionsNeeded != -1) {
                System.out.println("Target achieved after " + transactionsNeeded + " transaction(s)");
            } else {
                System.out.println("Target is not achieved");
            }
            
            System.out.println();
        }
    }
}
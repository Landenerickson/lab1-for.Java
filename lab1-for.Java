import java.util.Scanner;

public class Lab1For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] Prices = {6.49, 5.22, 3.24, 6.05, 5.22};
        String[] names = {"Sam", "Nick", "Jennifer", "Alicia"};
        int[][] amount = new int[5][4];
        double[] PersonTotal = new double[4];
        double[] ItemTotal = new double[5];
        double grandTotal = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(names[j] + " purchased: ");
                amount[i][j] = scanner.nextInt();
                PersonTotal[j] += amount[i][j] * itemPrices[i];
                ItemTotal[i] += amount[i][j] * itemPrices[i];
                grandTotal += amount[i][j] * itemPrices[i];
            }
        }
        
        System.out.println("\nFinal Table:");
        System.out.println("Item\tSam\tNick\tJennifer\tAlicia\tTotal");
        for (int i = 0; i < 5; i++) {
            System.out.print("Item" + (i + 1) + "\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(amount[i][j] + "\t");
            }
            System.out.println(ItemTotal[i]);
        }
        
        System.out.print("Total\t");
        for (int j = 0; j < 4; j++) {
            System.out.print(PersonTotal[j] + "\t");
        }
        System.out.println(grandTotal);
        
        scanner.close();
    }
}


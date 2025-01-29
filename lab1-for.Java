import java.util.Scanner;

public class Lab1For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] itemPrices = {6.49, 5.22, 3.24, 6.05, 5.22};
        String[] names = {"Sam", "Nick", "Jennifer", "Alicia"};
        int[][] quantities = new int[5][4];
        double[] totalPerPerson = new double[4];
        double[] totalPerItem = new double[5];
        double grandTotal = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter quantities for Item " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print(names[j] + " purchased: ");
                quantities[i][j] = scanner.nextInt();
                totalPerPerson[j] += quantities[i][j] * itemPrices[i];
                totalPerItem[i] += quantities[i][j] * itemPrices[i];
                grandTotal += quantities[i][j] * itemPrices[i];
            }
        }
        
        System.out.println("\nFinal Table:");
        System.out.println("Item\tSam\tNick\tJennifer\tAlicia\tTotal");
        for (int i = 0; i < 5; i++) {
            System.out.print("Item" + (i + 1) + "\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(quantities[i][j] + "\t");
            }
            System.out.println(totalPerItem[i]);
        }
        
        System.out.print("Total\t");
        for (int j = 0; j < 4; j++) {
            System.out.print(totalPerPerson[j] + "\t");
        }
        System.out.println(grandTotal);
        
        scanner.close();
    }
}


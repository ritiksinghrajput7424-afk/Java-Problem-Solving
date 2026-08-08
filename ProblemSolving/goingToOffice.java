package ProblemSolving;

import java.util.Scanner;

public class goingToOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long totalKM = scanner.nextLong();
        long OnlineTaxiCost = scanner.nextLong();
        long OnlineTaxiKM = scanner.nextLong();
        long OnlineTaxiCharge = scanner.nextLong();
        long classicTaxiSpeed = scanner.nextLong();
        long classicTaxicost = scanner.nextLong();
        long classicTaxiPerMinCost = scanner.nextLong();
        long classicTaxiPerKmCost = scanner.nextLong();
        long onlieTaxi = 0;
        if ((totalKM - OnlineTaxiKM) <= 0) {
            onlieTaxi = OnlineTaxiCost;
        } else {
            onlieTaxi = OnlineTaxiCost + (totalKM - OnlineTaxiKM) * OnlineTaxiCharge;
        }

        long classicTaxi = classicTaxicost + (totalKM / classicTaxiSpeed) * classicTaxiPerMinCost + totalKM * classicTaxiPerKmCost;
        if (onlieTaxi < classicTaxi || onlieTaxi == classicTaxi) {
            System.out.println("Online Taxi");
        } else {
            System.out.println("Classic Taxi");
        }
    }
}

package ProblemSolving;

import java.util.Scanner;

public class sevensegmentDisplay {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            int matchCount = 0;
            StringBuilder sb = new StringBuilder();
            String num = scanner.next();
            for (int j = 0; j <= num.length() - 1; j++) {
                int num1 = num.charAt(j) - '0';
                if (num1 == 0 || num1 == 6 || num1 == 9) {
                    matchCount = matchCount + 6;
                } else if (num1 == 1) {
                    matchCount = matchCount + 2;
                } else if (num1 == 2 || num1 == 3 || num1 == 5) {
                    matchCount = matchCount + 5;
                } else if (num1 == 4) {
                    matchCount = matchCount + 4;
                } else if (num1 == 7) {
                    matchCount = matchCount + 3;
                } else {
                    if (num1 == 8) {
                        matchCount = matchCount + 7;
                    }
                }
            }
            while (matchCount != 0) {
                if (matchCount % 2 == 0) {
                    sb.append("1");
                    matchCount = matchCount - 2;
                } else {
                    sb.append("7");
                    matchCount = matchCount - 3;
                }
            }
            arr[i] = sb.toString();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

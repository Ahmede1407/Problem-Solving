package Groups.FourNumbers;
//problem: https://codeforces.com/group/ndZ5Fwlwj8/contest/311256/problem/A

import java.util.Scanner;

public class FourNumbers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println((long) a * b * c * d);
    }
}

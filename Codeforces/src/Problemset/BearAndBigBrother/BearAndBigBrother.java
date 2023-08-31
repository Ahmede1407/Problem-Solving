package Problemset.BearAndBigBrother;
// problem: https://codeforces.com/problemset/problem/791/A

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int LimakWeight = scanner.nextInt();
        int BobWeight = scanner.nextInt();
        int totalNumOfYears = 0;

        while (LimakWeight <= BobWeight){
            totalNumOfYears += 1;
            LimakWeight = LimakWeight *3;
            BobWeight = BobWeight *2;

        }

        System.out.println(totalNumOfYears);
    }
}

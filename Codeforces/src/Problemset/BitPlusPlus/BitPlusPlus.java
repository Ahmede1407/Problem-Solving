package Problemset.BitPlusPlus;
// problem: https://codeforces.com/problemset/problem/282/A

import java.util.Objects;
import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numOfStatements = scanner.nextInt();
        int finalValueOfX = 0;

        // create a loop based on the number of statements given
        for (int i = 0; i < numOfStatements; i++) {
            // read the operation and compare it if it will increase or decrease to the X value
            String operation = scanner.next();
            if (Objects.equals(operation, "++X") || Objects.equals(operation, "X++")){
                finalValueOfX +=1;
            } else if (Objects.equals(operation, "--X") || Objects.equals(operation, "X--")){
                finalValueOfX -=1;
            } {

            }
        }
        System.out.println(finalValueOfX);
    }
}

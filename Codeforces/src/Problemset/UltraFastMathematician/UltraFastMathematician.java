package Problemset.UltraFastMathematician;

// problem: https://codeforces.com/problemset/problem/61/A

import java.util.ArrayList;
import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String  firstNum = scanner.next();
        String secondNum = scanner.next();

        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < firstNum.length() ; i++) {
            if (firstNum.charAt(i) == secondNum.charAt(i)){
                output.add(0);
            } else {
                output.add(1);
            }
        }

        for (int out : output) {
            System.out.print(out);
        }
    }
}

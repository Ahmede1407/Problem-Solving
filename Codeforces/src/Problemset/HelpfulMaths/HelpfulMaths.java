package Problemset.HelpfulMaths;
// problem: https://codeforces.com/problemset/problem/339/A

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String inputNums = scanner.next();
        List<Integer> numsWithoutPlus = new ArrayList<>();

        for (int i = 0; i < inputNums.length(); i++) {
            char charts = inputNums.charAt(i);
            if (charts != '+'){
                numsWithoutPlus.add(charts - '0');
            }
        }
        Collections.sort(numsWithoutPlus);

        for (int i = 0; i < numsWithoutPlus.size(); i++) {
            if (i == numsWithoutPlus.size() - 1){
                System.out.print(numsWithoutPlus.get(i));
            } else {
                System.out.print(numsWithoutPlus.get(i) + "+");
            }
        }
    }
}

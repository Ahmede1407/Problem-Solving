package Groups.Digits;

// problem: https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/Q

import java.util.Scanner;

public class Digits {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int inputSize = scanner.nextInt();

        for (int i = 0; i < inputSize; i++){
            int num = scanner.nextInt();
            if (num == 0){
                System.out.println(0);
                continue;
            }
            while (num > 0){
                int digits = num % 10;
                System.out.print(digits + " ");
                num /= 10;
            }

            System.out.println();
        }
    }
}

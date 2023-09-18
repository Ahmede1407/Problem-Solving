package Problemset.YoungPhysicist;
// problem: https://codeforces.com/problemset/problem/69/A

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numOfLines = scanner.nextInt();
        int x = 0; int y = 0; int z = 0;

            for (int j = 0; j < numOfLines; j++) {
                x += scanner.nextInt();
                y += scanner.nextInt();
                z += scanner.nextInt();
            }

        if (x == 0 && y == 0 && z == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
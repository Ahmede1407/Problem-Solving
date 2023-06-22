package Problemset.BeautifulMatrix;
// problem: https://codeforces.com/problemset/problem/263/A

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = new int[5][5];
        int numOfMoves = 0;

        // creating a 5*5 matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j]= scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // get the position of number 1
                if (matrix[i][j] ==1){
                    // check if number 1 is not in the center of the matrix
                    if (i != 2 || j !=2){
                        numOfMoves = Math.abs(2-i) + Math.abs(2-j);
                    }
                }
            }
        }

        System.out.println(numOfMoves);
    }
}

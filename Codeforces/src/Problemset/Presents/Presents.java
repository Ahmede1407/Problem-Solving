package Problemset.Presents;
// problem: https://codeforces.com/problemset/problem/136/A

import java.util.ArrayList;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numOfFriends = scanner.nextInt();
        ArrayList<Integer> presents = new ArrayList<Integer>();

        //initiallizing array with random values:
        for (int i = 0; i <= numOfFriends; i++) {
            presents.add(0);
        }

        for (int i = 1; i <= numOfFriends ; i++) {
            int present = scanner.nextInt();
            presents.set(present, i);
        }

        for (int i = 1; i <= numOfFriends ; i++) {
            System.out.print(presents.get(i) + " ");
        }
    }
}

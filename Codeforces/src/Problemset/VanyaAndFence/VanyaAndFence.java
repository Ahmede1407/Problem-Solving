package Problemset.VanyaAndFence;
// problem: https://codeforces.com/problemset/problem/677/A

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numberOfFriends = scanner.nextInt();
        int heightOfTheFence = scanner.nextInt();
        int minimumPossibleValidWidthOfTheRoad = 0;

        for (int i = 0; i < numberOfFriends; i++) {
            int heightOfEachFriend = scanner.nextInt();
            if (heightOfEachFriend > heightOfTheFence){
                minimumPossibleValidWidthOfTheRoad += 2;
            } else {
                minimumPossibleValidWidthOfTheRoad += 1;
            }
        }

        System.out.println(minimumPossibleValidWidthOfTheRoad);
    }
}

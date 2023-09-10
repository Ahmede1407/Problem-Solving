package Problemset.Elephant;
// problem: https://codeforces.com/problemset/problem/617/A

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int friendsHouse = scanner.nextInt();
        int minimumNumOfSteps = 0;

        while (friendsHouse > 0){
            if (friendsHouse >= 5){
                minimumNumOfSteps += 1;
                friendsHouse = friendsHouse - 5;
            } else if (friendsHouse >= 4) {
                minimumNumOfSteps += 1;
                friendsHouse = friendsHouse - 4;
            } else if (friendsHouse >= 3) {
                minimumNumOfSteps += 1;
                friendsHouse = friendsHouse - 3;
            } else if (friendsHouse >= 2) {
                minimumNumOfSteps += 1;
                friendsHouse = friendsHouse - 2;
            } else {
                minimumNumOfSteps += 1;
                friendsHouse = friendsHouse - 1;
            }
        }
        System.out.println(minimumNumOfSteps);
    }
}

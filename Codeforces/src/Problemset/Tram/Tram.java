package Problemset.Tram;
// problem: https://codeforces.com/problemset/problem/116/A

import java.util.Scanner;

public class Tram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numOfStations = scanner.nextInt();

        int totalPassengers = 0;
        int minimumPossibleCapacityOfTheTram = 0;

        for (int i = 0; i < numOfStations; i++) {
            int exitingPassengers = scanner.nextInt();
            int enteringPassengers = scanner.nextInt();

            totalPassengers = enteringPassengers - exitingPassengers + totalPassengers;

            if (minimumPossibleCapacityOfTheTram < totalPassengers){
                minimumPossibleCapacityOfTheTram = totalPassengers;
            }
        }

        System.out.println(minimumPossibleCapacityOfTheTram);
    }
}

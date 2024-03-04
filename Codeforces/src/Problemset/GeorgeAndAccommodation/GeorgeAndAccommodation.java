package Problemset.GeorgeAndAccommodation;
// problem: https://codeforces.com/problemset/problem/467/A


import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int numberOfRooms = scanner.nextInt();

        for (int i = 0; i < numberOfRooms; i++) {
            int roomResidents = scanner.nextInt();
            int roomCapacity = scanner.nextInt();

            if ((roomCapacity - roomResidents) >= 2){
                counter++;
            }
        }

        System.out.println(counter);
    }
}

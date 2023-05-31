package Problemset.TheatreSquare;
// problem: https://codeforces.com/problemset/problem/1/A

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long width = scanner.nextInt();
        long height = scanner.nextInt();
        long flagstoneSide = scanner.nextInt();



        long numOfFlagstonesAccordingToWidth = (long) Math.ceil((double) width /flagstoneSide);
        long numOfFlagstonesAccordingToHeight = (long) Math.ceil((double) height /flagstoneSide);

        System.out.println(numOfFlagstonesAccordingToWidth * numOfFlagstonesAccordingToHeight);
    }
}

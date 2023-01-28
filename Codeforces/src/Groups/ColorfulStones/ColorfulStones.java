package Groups.ColorfulStones;
// problem: https://codeforces.com/contest/265/problem/A

import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String sequenceOfStones = scanner.next();
        String instructions = scanner.next();
        int finalPosition = 1;
        int indexOfSequenceOfStones = 0;

        for (int i = 0; i < instructions.length(); i++){
            if (sequenceOfStones.toCharArray()[indexOfSequenceOfStones] == instructions.toCharArray()[i]){
                finalPosition++;
                indexOfSequenceOfStones++;
            }
        }

        System.out.println(finalPosition);
    }
}

package Problemset.QueueAtTheSchool;
// problem: https://codeforces.com/problemset/problem/266/B

import java.util.Scanner;

public class QueueAtTheSchool {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numOfTheChildrenInTheQueue = scanner.nextInt();
        int time = scanner.nextInt();
        String schoolchildrenArrangement = scanner.next();

        for (int i = 0; i<time; i++){
            for (int j = 0; j < numOfTheChildrenInTheQueue -1; j++) {
                if (schoolchildrenArrangement.charAt(j) == 'B' && schoolchildrenArrangement.charAt(j+1) == 'G'){
                    schoolchildrenArrangement = schoolchildrenArrangement.substring(0, j) + "GB" + schoolchildrenArrangement.substring(j+2);
                    j++;
                }
            }
        }

        System.out.println(schoolchildrenArrangement);

    }

}

package Groups.factorial;

// problem: https://codeforces.com/group/ndZ5Fwlwj8/contest/312340/problem/B?fbclid=IwAR1i3LD3TLBsWLeAMCMMX4WnC8Pfm95ust5c_EDGqzRaUmP4DvVB35jwnNc


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long sum ;

        if (num == 1){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

}

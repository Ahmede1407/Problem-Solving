package Groups.PUM;
// problem: https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/V

import java.util.Scanner;

public class Pum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num * 4 ; i++ ){

            if (i % 4 == 0){
                System.out.println("PUM");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

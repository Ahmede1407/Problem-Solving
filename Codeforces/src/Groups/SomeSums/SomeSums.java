package Groups.SomeSums;
// problem: https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/U

import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int firstLimit = scanner.nextInt();
        int secondLimit = scanner.nextInt();
        int sum = 0;

        for (int i =1; i<= number; i ++){
            if (i/10 ==0){
                if (i>= firstLimit && i<= secondLimit){
                    sum += i;
                }
            } else {
                int itterator = i;
                int sumOfDigits = 0;

                while (itterator > 0){
                    int digits = itterator % 10;
                    sumOfDigits += digits;
                    itterator /= 10;
                }
                if (sumOfDigits>= firstLimit && sumOfDigits<= secondLimit){
                    sum += i;
                }
            }
        }

        System.out.println(sum);
    }
}

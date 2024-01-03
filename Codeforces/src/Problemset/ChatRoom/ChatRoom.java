package Problemset.ChatRoom;
// problem: https://codeforces.com/problemset/problem/58/A

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String hello = "hello ";
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == hello.charAt(counter)){
                counter++;
            }
        }
        if (counter == 5){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}

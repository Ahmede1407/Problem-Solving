package Groups.SearchInMatrix;
// problem: https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/S?fbclid=IwAR3JjUf1JLsit1-xplYZTH8vuWQR_YtErwvcvFsgXlm9xyNmenBi-oxx7Mo

import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int raw = scanner.nextInt();
        int col = scanner.nextInt();

        int [][] matrix = new int[raw][col];

        for (int i = 0; i < raw; i++){
            for (int j = 0; j < col; j++){
                matrix[i][j]= scanner.nextInt();
            }
        }

        int searchByNum = scanner.nextInt();
        boolean isFounded= false;
        for (int i = 0; i < raw; i++){
            for (int j = 0; j < col; j++){
                if (matrix[i][j] == searchByNum){
                    isFounded = true;
                    break;
                }
            }
        }

        if (isFounded){
            System.out.println("will not take number");
        }
         else {
            System.out.println("will take number");
         }

    }
}

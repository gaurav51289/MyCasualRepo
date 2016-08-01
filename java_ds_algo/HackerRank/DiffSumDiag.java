

//Given a square matrix of size NxN , calculate the absolute difference between the sums of its diagonals.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiffSumDiag {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        int sum1, sum2;
        sum1 = 0; sum2 = 0;
        int col1, col2;
        col1=0; col2 = n-1;
        
        for(int row = 0; row < n; row++){
            sum1 = sum1 + a[row][col1];
            sum2 = sum2 + a[row][col2];
            System.out.println(row + " " +col1);
            System.out.println(row + " " +col2);
            col1++;
            col2--;
        }
        
        System.out.print(Math.abs(sum1 - sum2));
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

/**
 *
 * @author X1 User
 */
import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class DiagonalDifference {
    public static int[][] create2DArray(int n){
        int[][] matrix = new int[n][n];
        return matrix;
    }
    
    public static void addRowToMatrix(int[][] matrix, String input, int rowNumber){
        String[] sInput = input.split(" ");
        int n=matrix.length;
        for(int i =0; i<n; i++){
        matrix[rowNumber][i] = parseInt(sInput[i]);
        }
    }
    
    public static int absDiffBtwDiagonals(int[][] matrix){
        int LRDiagonalSum=0;
        int RLDiagonalSum=0;
        
        int n = matrix[0].length;
        int RLDiagonalTrack = matrix[0].length-1;
        //first get sum of LR diagonal
            for(int i =0; i<n; i++){
                for (int j=0; j<n; j++){
                    if(i==j){
                        LRDiagonalSum += matrix[i][j];
                    }
                    if(i+j==RLDiagonalTrack){
                        RLDiagonalSum += matrix[i][j];
                    }
                }
            }
        System.out.println("LR Diagonal Sum: " + LRDiagonalSum + "\nRL Diagonal Sum: " + RLDiagonalSum);
        return Math.abs(LRDiagonalSum - RLDiagonalSum);
        //return abs diff btw lr & rl diagonal sum
    }
    
    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for (int i : row){
                System.out.print(i);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\\n");
        
        //input for n
        int n = scan.nextInt();
        
        //create the 2Darray
        int[][] matrix = create2DArray(n);
        //take in n lines for the nxn matrix
        for(int i=0; i<n; i++){
            System.out.println("Enter " + i + "th row of numbers");
          String numbers = scan.next();
                addRowToMatrix(matrix, numbers, i);
        }
        
        printMatrix(matrix);
        int answer = absDiffBtwDiagonals(matrix);
        System.out.println(answer);
      
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    
}

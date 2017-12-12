package Algorithms;

//Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
//
//Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
//
//Input Format
//
//The first line contains an integer, , denoting the size of the array. 
//The second line contains  space-separated integers describing an array of numbers .
//
//Output Format
//
//You must print the following  lines:
//
//A decimal representing of the fraction of positive numbers in the array compared to its size.
//A decimal representing of the fraction of negative numbers in the array compared to its size.
//A decimal representing of the fraction of zeroes in the array compared to its size.
//Sample Input
//
//6
//-4 3 -9 0 4 1         
//Sample Output
//
//0.500000
//0.333333
//0.166667
//Explanation
//
//There are  positive numbers,  negative numbers, and  zero in the array. 
//The respective fractions of positive numbers, negative numbers and zeroes are ,  and , respectively.

/**
 *
 * @author X1 User
 */
import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
import java.text.DecimalFormat;

public class PlusMinus {
    public static int[] createArray(int n, String numbers){
        String[] temp = new String[n];
        int[] array = new int[n];
        temp = numbers.split(" ");
        for(int i = 0; i<n; i++){
            array[i] = parseInt(temp[i]); 
        }
        return array;
    }
    
    public static void printArray(int[] array){
        for(int i =0; i<array.length; i++)
        System.out.print(array[i] + " ");
    }
    
    public static void calculateStats(int[] array){
        DecimalFormat numberFormat = new DecimalFormat("0.000000");
        double n = array.length;
        double positive = 0;
        double negative = 0;
        double zero = 0;
    for (int i : array){
        if(i>0){
            positive++;
        }
        else if(i<0){
            negative++;
        }
        else if (i==0){
            zero++;
        }
    }
        System.out.println(numberFormat.format(positive/n));
        System.out.println(numberFormat.format(negative/n));
        System.out.println(numberFormat.format(zero/n));
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\\n");
        //take in n size of the array
        int n = scan.nextInt();
        
        //take in the line of numbers for the array
        String numbers = scan.next();
        
        
        //create the array
        int[] array = createArray(n, numbers);
        //printArray(array);
        calculateStats(array);
        
        //calculate the fractions of positive, negative and zeroes; print them out
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    
}

//HARD
package DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author Vivian Leung
 */
public class ArrayManipulation {
    public static long[] arrayIntegers;
    
    public static void printMaxInArray(){
        long max = arrayIntegers[0];
            for(long i: arrayIntegers){
                if(i>max){
                    max = i;
                }
            }
        System.out.println(max);
        }

    public static long[] createIntArray(int n){
        long[] array = new long[n];
        //initialize every element to be zero
        for(long i: array){
            i = 0;
        }
        return array;
    }
    
    public static void updateArray(int a, int b, long k){
        if(a>=1 && b<=arrayIntegers.length){
            for(int i=a-1; i<b; i++){
            arrayIntegers[i] += k;
        }
        }
        else{
            System.out.println("invalid; a must be greater than 0 & b must be less than or equal to n elements");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take in the n amount of elements in the array
        int n = in.nextInt();
        
        //create an array of n integers
        arrayIntegers = createIntArray(n);
        
        
        
        //take in m the amount of operations to update the array
        int m = in.nextInt();
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            long k = in.nextLong();
            updateArray(a, b, k);
        }
        in.close();
        //System.out.println(Arrays.toString(arrayIntegers));
        printMaxInArray();
    }
}

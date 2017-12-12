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
    public static int[] arrayIntegers;
    
    public static void printMaxInArray(){
        int max = arrayIntegers[0];
            for(int i: arrayIntegers){
                if(i>max){
                    max = i;
                }
            }
        System.out.println(max);
        }

    public static int[] createIntArray(int n){
        int[] array = new int[n];
        //initialize every element to be zero
        for(int i: array){
            array[i] = 0;
        }
        return array;
    }
    
    public static void updateArray(int a, int b, int k){
        for(int i=a-1; i<b; i++){
            arrayIntegers[i] += k;
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
            int k = in.nextInt();
            updateArray(a, b, k);
        }
        in.close();
        //System.out.println(Arrays.toString(arrayIntegers));
        printMaxInArray();
    }
    
}

//MEDIUM challenge
package DataStructures;

/**
 *
 * @author Vivian Leung
 */
import java.util.*;
import java.io.*;

public class SparseArrays {
    public static String[] arrayStrings;
    public static String[] arrayQueries;
    public static int[] arrayTally;
    
    //calculate how many times the query entry appears in the aray of strings
    public static void calculateQueryOccurencesInStrings(){
    for(int i=0; i<arrayQueries.length; i++){
        for(String s : arrayStrings){
            if(arrayQueries[i].equals(s)){
                arrayTally[i]++;
            }
        }
    }
    }
    
    public static void printTally(){
        for(int i : arrayTally){
            System.out.println(i);
        }
    }
    
    public static String[] createStringArray(int n){
        String[] array = new String[n];
        return array;
    }
    
    public static int[] createIntArray(int n){
        int[] array = new int[n];
        return array;
    }

    public static void addStringToArray(int i, String string, String[] array){
        array[i] = string;
    }
    
    public static void printIntArray(int[] array){
        for(int i =0; i<array.length; i++)
        System.out.print(array[i] + " ");
    }
    
    public static void printStringArray(String[] array){
        for(int i =0; i<array.length; i++)
        System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useDelimiter("\\n");
        //take in n amt of strings
        int n = s.nextInt();
        
        //create an array of size n to store the strings in
        arrayStrings = createStringArray(n);
        for(int i=0; i<n; i++){
            String string = s.next();
            //System.out.println(string);
            addStringToArray(i, string, arrayStrings);
        }
        //printStringArray(arrayStrings);
        
        //take in the q amt of queries
        int q = s.nextInt();
        //System.out.println(q);
        
        //create an array for tally of size q
        arrayTally = createIntArray(q);
        //create an array for queries of size q
        arrayQueries = createStringArray(q);
        for(int i=0; i<q; i++){
            String string = s.next();
            //System.out.println(string);
            addStringToArray(i, string, arrayQueries);
        }
        
        //calculate tallys
        //tally every query in array[i] that appears in the array of strings
        calculateQueryOccurencesInStrings();
        //print the tally
        printTally();
    }
    
}

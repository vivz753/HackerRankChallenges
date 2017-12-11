package DataStructures;

/**
 *
 * @author Vivian Leung
 */
import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;
public class ReverseArray {
    //Recursive method to reverse an array; switches the first and last elements till the halfway point is reached; runtime is n/2; space is n;
    public static int[] reverseArray(int[] input, int x,  int y){
        int temp=0;
        if(x==y){
            return input;
        }
        else if (x==y-1 && y==x+1){
            temp = input[y];
            input[y] = input[x];
            input[x] = temp;
            return input;
        }
        else{
        temp = input[y];
        input[y] = input[x];
        input[x] = temp;
        reverseArray(input, x+1, y-1);
    }
        return input;
    }
    
    public static int[] createArray(int n, String numbers){
        //String[] temp = new String[n];
        String[] temp = numbers.split(" ");
        
        //System.out.println(Arrays.toString(temp));
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = parseInt(temp[i]);
        }
        //System.out.println("Array of" + array.length + "created:");
        //printArray(array);
        return array;
    }
    
    public static void printArray(int[] array){
        for(int i =0; i<array.length; i++)
        System.out.print(array[i] + " ");
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
//Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
    
        //^^TL;DR: if you don't use the delimeter, scan.next() won't take all the numbers in the next line
        Scanner scan = new Scanner(System.in).useDelimiter("\\n");
        //take in input of first line (N, the number of elements in array)
        //System.out.println("Enter n size for array");
        int n = scan.nextInt();
        //take in input of second line (N integers w/ space in between)
        //System.out.println("Enter n elements seperated by a space");
        String numbers = scan.next();
        //
        int[] array = createArray(n, numbers);
        reverseArray(array, 0, array.length-1);
        printArray(array);
    }
}

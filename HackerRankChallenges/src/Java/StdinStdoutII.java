/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.*;
import java.io.*;
/**
 *
 * @author X1 User
 */
public class StdinStdoutII {
    //for some reason this works on NetBeans, but not on the hackerrank compiler; see the next void main for hackerrank solution
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\\n");
        int i = scan.nextInt();
        //scan.nextLine();
        double d = scan.nextDouble();
        //scan.nextLine();
        String s = scan.next();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
     
     
     //this also works
     
     
//     public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        scan.nextLine();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.next();
//
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//    }
    
}

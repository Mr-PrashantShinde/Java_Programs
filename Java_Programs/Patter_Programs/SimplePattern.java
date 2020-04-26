/**
 * SimplePattern
 * 
 * eg:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */

import java.util.Scanner;

public class SimplePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        sc.close();

        // logic
        System.out.println("****************************");
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
        
        System.out.println("****************************");
    }    
}
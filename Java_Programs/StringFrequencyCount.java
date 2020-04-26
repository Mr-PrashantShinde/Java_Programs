/**
 * StringFrequencyCount
 */

import java.util.Scanner;
public class StringFrequencyCount {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter main String");
       String parentStr = sc.next();
       System.out.println("Enter substring to find in main string");
       String subStr = sc.next();
       sc.close();
       int count = 0;

       if (parentStr.contains(subStr)) {
           count++;
       }

       System.out.println(count);
   } 
}
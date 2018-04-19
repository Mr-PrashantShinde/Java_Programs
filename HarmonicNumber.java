/**
 * HarmonicNumber 
 */
import java.util.*;
public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to get its harmonic value");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        double sum = 0.0;
        for (int i = 1; i <= num; i++) {
            sum = sum + 1.0/i;
        }
        System.out.println(sum);

    }


    
}
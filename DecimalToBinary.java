/**
 * DecimalToBinary
 */
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int power = 1;
        while (power <= num/2) {
            power = power * 2;
        }

        while (power > 0) {
            if (num < power) {
                System.out.print(0);
            }
            else {
                System.out.print(1);
                num = num - power;
            }
            power = power/2;
        }


    }

    
}
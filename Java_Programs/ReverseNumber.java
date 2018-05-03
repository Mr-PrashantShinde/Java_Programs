import java.util.Scanner;

/**
 * ReverseNumber
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("!!! Enter any number !!!");
        int num = sc.nextInt();
        sc.close();
        reverse(num);
        //System.out.println(reverse);    
    }
    
    public static int reverse(int num){
        if (num < 0 ) {
            System.out.println(" Enter positive number");
        }
        else if (num > 0 && num < 10) {
            System.out.println(num);
        }
        else {
            int reverse = 0;
            int remainder = 0;
            do {
                remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num / 10;
            } while (num > 0);

        System.out.println(reverse);
        }
        return num;
    }
}

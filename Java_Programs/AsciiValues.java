import java.util.Scanner;

/**
 * AsciiValues
 */
public class AsciiValues { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String");
        String str = sc.next();
        System.out.println("Enter the index number to make it Capital");
        int index = sc.nextInt();
        sc.close();

        char[] strCharArray = str.toCharArray();
        for (int i = 0; i < strCharArray.length; i++) {
            if (i == index) {
                strCharArray[i] = (char)(((int)strCharArray[i])-32);
            }
        }
        System.out.println(strCharArray);
    }   
}
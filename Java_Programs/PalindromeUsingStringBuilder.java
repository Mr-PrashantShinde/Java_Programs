import java.util.Scanner;

/**
 * PalindromeUsingStringBuilder
 */
public class PalindromeUsingStringBuilder {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String to check palindrome or not");
       String str1 = sc.next();
       sc.close();
       PalindromeUsingStringBuilder pd =new PalindromeUsingStringBuilder();
       pd.isPalindrome(str1);

   } 

   public String isPalindrome(String str1) {
       StringBuilder sb = new StringBuilder(str1);
       String str2 = sb.reverse().toString();
       if (str1.equals(str2)) {
           System.out.println("is Palindrome");
       }
       else{
           System.out.println("not palindrome");
       }
       return str2;
   }
}
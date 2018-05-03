import java.util.Scanner;


/**
 * ReverseString
 * 
 * Reverse the string using method
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Enter any String ***");
        String str = sc.next();
        sc.close();
        String revstr = "";
        Reverse rs = new Reverse();
        rs.RevStr(str);
        System.out.println(revstr);
    }
}


class Reverse {
    public String RevStr(String str){
        char[] resultArray = new char[str.length()];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            resultArray[i] = charArray[(charArray.length)-i-1];
        }
        String revstr = new String(resultArray);
        return revstr;
    }
}
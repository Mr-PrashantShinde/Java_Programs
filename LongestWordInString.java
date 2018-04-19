/**
 * LongestWordInString
 */
public class LongestWordInString {
    public static void main(String[] args){
        String str = "Welcome to Java Programming";
        String longestWord = "";
        //char[] charArray = str.toCharArray();
        String[] stringArray = str.split(" ");

        for (int i = 0; i < stringArray.length; i++) {
        
                if (stringArray[i].length() >= longestWord.length()) {
                    longestWord = stringArray[i];
                }
            
            
        }
        System.out.println(longestWord);
        System.out.println(longestWord.length());
    }

    
}
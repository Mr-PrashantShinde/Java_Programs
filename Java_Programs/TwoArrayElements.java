import java.util.Scanner;

/**
 * 2DArrayElements
 * 
 */
public class TwoArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;

        // Taking input in first array
        System.out.println("How many Elements you want to add in Arrar 1?");
        n = sc.nextInt();
        int[] Array1 = new int[n];
        for (int i = 0; i < n; i++) {
            Array1[i] = sc.nextInt();
        }

        // taking input in Second Array
        System.out.println("How many Elements you want to add in Arrar 2?");
        m = sc.nextInt();
        int[] Array2 = new int[m];
        for (int i = 0; i < m; i++) {
            Array2[i] = sc.nextInt();
        }

        //
        sc.close();

        // calculating count

        int[] resultArray = null;


        if (n > m) {
            resultArray = new int[n];           
        }
        else{
            resultArray = new int[m];
        }
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Array2[i] <= Array1[j]) {
                    count++;
                }
            }
            if (count != 0) {
                resultArray[i] = count;
            }
            count = 0;
        }

        // removing trailing zeroes
        int[] finalResult = null;
        int countOfZeros = 0;
        int finalSizeOfArray = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if(resultArray[i] == 0){
                countOfZeros++;
            }
        }
        finalSizeOfArray = countOfZeros;
        finalResult = new int[finalSizeOfArray];
        for (int i = 0; i < finalSizeOfArray; i++) {
            finalResult[i] = resultArray[i];
        }

        // printing result array
        for (int i = 0; i < finalResult.length; i++) {
            System.out.print(finalResult[i]+" ");
        }

      



   

    }

    
}
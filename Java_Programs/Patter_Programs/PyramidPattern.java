import java.util.Scanner;

/**
 * PyramidPattern
 * 
 * eg:
 * 1
 * 3*2
 * 6*5*4
 * 10*9*8*7
 * 
 */
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        sc.close();
        PyramidPattern obj = new PyramidPattern();
        System.out.println("******************************");
        obj.printPattern(num);
        System.out.println("******************************");
    }

    public void printPattern(int num){
        // logic
        
        int count1=1,count2;
		for(int i=1;i<=num;i++) {
			
			count2=count1+i;
			int flag=-1;
			for(int j=1;j<=i;j++,count1++) {
				
				if(flag==1) System.out.print("*");
				flag=1;
				
				System.out.print(--count2);
			}
			System.out.println();
		}
    }
}

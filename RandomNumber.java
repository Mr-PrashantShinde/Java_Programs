public class RandomNumber {
	public static void main(String[] args) {
		// a positive number
		int num = 9999 ;
		// a pseudo-random real between 0.0 and 1.0
		double r = Math.random();
		// a pseudo-random integer between 0 and n-1
		int value = (int) (r * num);
		System.out.println(value);
	}
}
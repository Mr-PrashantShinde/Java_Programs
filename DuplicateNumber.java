import java.util.*;

class DuplicateNumber {
	public static void main(String[] args) {
		//System.out.println("HII");
		List<Integer> numbers = new ArrayList<Integer>();
		// adding numbers in list.
		for(int i=1; i<=30; i++){
			numbers.add(i);
		}

		// displaying numbers
		for (int n :numbers ) {
			System.out.println(n);
		}

		//method to find duplicate number.
		int findDuplicateNumber(List<Integer> numbers){
			int highestNumber = numbers.size();
			return highestNumber;
		}

		//sum of all numbers in list
		int sumOfNumbers(List<Integer> numbers){
			int sum = 0;
			for(int j:numbers){
				int sum = sum + j;
			}
			return sum;
		}

		//check
		DuplicateNumber dn = new DuplicateNumber();
		//dn.findDuplicateNumber(numbers);
		dn.sumOfNumbers(numbers);
		System.out.println(highestNUmber);


	}
}
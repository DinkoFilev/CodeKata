package Factorial;

public class Factorial {

	public static void main(String[] args) {
		Factorial fc = new Factorial();
		System.out.println(fc.factorial(10));
		System.out.println(fc.factorialR(10));
	}

	/**
	 * by Loop
	 */
	int factorial(int fNO) {
		int result = 1;
		while (fNO > 0) {
			result *= fNO;
			fNO--;
		}
		return result;

	}
	
	/**
	 * by Recursion
	 */
	
	int factorialR(int fNO){
		
		if (fNO <= 1) {
			return 1;
		} else {
			return fNO * factorialR(--fNO);
		}
	}
}

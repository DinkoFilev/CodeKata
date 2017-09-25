package Fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();

		System.out.println(fb.fibonacci(10));
		System.out.println(fb.fibonacciR(10));
	}

	/**
	 * by Loop
	 * 
	 * @param num
	 */
	int fibonacci(int num) {
		int result = 0;
		int nextNum = 1;
		while (num > 1) {
			result += nextNum;
			if (result > 1) {
				nextNum = result - nextNum;
			}
			--num;
		}
		return result > 0 ? result : 1;
	}

	/**
	 * by Recursion
	 */
	int fibonacciR(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		}
		return fibonacciR(num - 1) + fibonacciR(num - 2);
	}

}
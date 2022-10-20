
public class FibonacciNumber {
    //The Fibonacci sequence to 6 is [ 0, 1, 1, 2, 3, 5, 8]
    public static void main(String[] args) {
		int n= 6;
		for (int i = 0; i < n; i++) {
			System.out.println(fibonacci(i) + " ");
		}
		
	}
    public static int fibonacci(int n) {
		if (n == 0 || n == 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);

	}
}
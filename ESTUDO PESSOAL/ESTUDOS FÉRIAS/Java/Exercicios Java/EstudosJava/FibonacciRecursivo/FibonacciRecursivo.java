
public class FibonacciRecursivo {

	static int fibonacci(int num) {
		
		if(num < 2) {
			return 1;
		}
		
		return fibonacci(num-1) + fibonacci(num-2);
	}
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		
		

	}

}

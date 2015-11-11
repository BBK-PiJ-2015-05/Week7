public class Fib{
	
	public static void main(String args[]){
		Fib launch  = new Fib();
		long startTime = System.currentTimeMillis();
		System.out.println(launch.fib(45));
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		long startTime2 = System.currentTimeMillis();
		System.out.println(launch.fib2(45));
		long endTime2   = System.currentTimeMillis();
		long totalTime2 = endTime2 - startTime2;
		System.out.println(totalTime2);
	}
	
	
	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = fib(n-1) + fib(n-2);
			return result;
		}
	}
	
	// arrays are 0-based, so F(1) is stored at position 0, etc
	private int[] precalculated = null;
	
	public int fib2(int n) {
		if (precalculated == null) {
				initPrecalculatedArray(n);
		}
		if (precalculated[n-1] != -1) {
			return precalculated[n-1];
		} else {
			int result = fib(n-1) + fib(n-2);
			precalculated[n-1] = result;
			return result;
		}
	}
	
	private void initPrecalculatedArray(int size) {
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++) {
		precalculated[i] = -1; // to indicate "not calculated yet"
	}
	precalculated[0] = 1; // F(1)
	precalculated[1] = 1; // F(2)
	}
}
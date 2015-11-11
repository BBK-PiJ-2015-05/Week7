/**
* Week 7 Day 14
* 1. Recursive code, line by line
*/
public class DoggyMethod{
	
	public static void main(String args[]){
		DoggyMethod launch = new DoggyMethod();
		System.out.println(launch.doggyMethod(6));
		System.out.println(launch.doggyMethod2(6));
	}
	public int doggyMethod(int n) {
		int result = 0;
		if (n <= 0) {
			return 0;
		}else{
			result = doggyMethod(n-3) + n + doggyMethod(n-2);
		}
		return result;
	}

	private int[] precalculated = null;

	public int doggyMethod2(int n){
		if (precalculated == null){
			initPrecalculatedArray(n);
		}
		if(n <= 2){
			return n;
		}
		if(precalculated[n - 1] != -1){
			return precalculated[n - 1];
		}else{
			int result = doggyMethod2(n - 3) + doggyMethod2(n - 2) + n;
			precalculated[n - 1] = result;
			return result;
		}
	}

	private void initPrecalculatedArray(int size){
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++){
			precalculated[i] = -1;
		}
		precalculated[0] = 1;
		precalculated[1] = 2;
	}
}




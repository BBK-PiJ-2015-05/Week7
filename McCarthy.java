/**
* Week 7 Day 14
* 1. Recursive code, line by line
*/
public class McCarthy{
	
	public static void main(String args[]){
		McCarthy launch = new McCarthy();
		System.out.println(launch.mcCarthy91(95));
		
	}

	public int mcCarthy91(int n) {
		System.out.println(n);
		if (n > 100) {
			return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n + 11));
		}
	}
}

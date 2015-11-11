import java.util.*;

public class Hailstones {
	
	ArrayList<Integer> myArray = new ArrayList<Integer>();
	
	public static void main (String[] args) {
		Hailstones launch = new Hailstones();
		launch.launch();
	}
	
	public void launch(){
		System.out.println(collatz(7));
		for(int i = 0; i < myArray.size(); i++){
			System.out.print(myArray.get(i) + " ");
		}
		
	}
	
	public int collatz(int n){
		if(n == 1){
			myArray.add(n);
			return 1;
		}else if (n % 2 == 0) {
			myArray.add(n);
			return collatz(n/2);
		}else{  
			myArray.add(n);
			return collatz((3 * n) + 1);
		}
	}
}	
	
		
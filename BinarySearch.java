import java.util.List;

/**
* Week 7 Day 14
* 4. Binary Search
*/

public class BinarySearch{

	private List<Object> list;
	
	
	public boolean isEmpty(){
		if(list == null){
			return true;
		}
		return false;
	}
	
	public boolean contains(Object object){
		if(this.isEmpty()){
			return false;
		}
		return true;
	}
	
	
}
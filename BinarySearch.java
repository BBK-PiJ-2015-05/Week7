import java.util.List;

/**
* Week 7 Day 14
* 4. Binary Search
*/

public class BinarySearch<T>{

	private List<T> list;
	
	
	public BinarySearch(List<T> list){
		this.list = list;
	}
	
	public boolean isEmpty(){
		if(list.isEmpty()){
			return true;
		}
		return false;
	}
	
	public boolean contains(Object object){
		if(this.isEmpty()){
			return false;
		}else if(list.get(list.size()/2).equals(object)){
			return true;
		}
		return false;
	}
	
	
}
import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class TestBinary{
	
	List<Integer> testList;
	Integer testInt;
	BinarySearch testSearch;
	
	@Before
	public void initialiser(){
		testInt = 2;
		testList = new ArrayList<Integer>();
		testSearch = new BinarySearch(testList);
	}

	@Test
	public void testsBinaryListIsEmpty(){
		assertTrue(testSearch.isEmpty());
	}
	
	@Test
	public void testsReturnElementInListEmpty(){
		assertFalse(testSearch.contains(testInt));
	}
	
	@Test
	public void testsMiddleElementIsObject(){
		testList.add(testInt);
		assertTrue(testSearch.contains(testInt));
	}
	
}
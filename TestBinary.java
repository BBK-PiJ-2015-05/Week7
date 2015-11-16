import org.junit.*;
import static org.junit.Assert.*;

public class TestBinary{
	
	Integer testInt;
	BinarySearch testList;
	
	@Before
	public void initialiser(){
		testInt = 2;
		testList = new BinarySearch();
	}

	@Test
	public void testsBinaryListIsEmpty(){
		
		assertTrue(testList.isEmpty());
	}
	
	@Test
	public void testsReturnElementInListEmpty(){
		assertFalse(testList.contains(testInt));
	}
	
}
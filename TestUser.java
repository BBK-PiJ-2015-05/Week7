import org.junit.*;
import static org.junit.Assert.*;

/**
* Week 7 day 13
* Assignment 1. Practising TDD
* Sarah Connor
* Birkbeck Programming in Java 2015-2016
*/

public class TestUser{

	private UserImpl testUser;
	private LibraryMock mockLibrary;
	
	@Before
	public void initialize(){
		testUser = new UserImpl("Larry David");
		mockLibrary = new LibraryMock();
	}
	
	@Test
	public void testsGettersUser(){
		assertEquals("Larry David", testUser.getName());
		assertEquals(0, testUser.getId());
	}
	
	@Test
	public void testsRegister(){
		assertEquals(1, testUser.register(mockLibrary));
	}
	
	@Test
	public void testsGetLibrary(){
		testUser.register(mockLibrary);
		assertEquals("Westmount Public Library", testUser.getLibrary().getLibrary());
	}
	
}
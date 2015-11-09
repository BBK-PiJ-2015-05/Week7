import org.junit.*;
import static org.junit.Assert.*;

/**
* Week 7 day 13
* Assignment 1. Practising TDD
* Sarah Connor
* Birkbeck Programming in Java 2015-2016
*/

public class TestLibrary{

	private UserImpl testUser;
	private LibraryImpl library;
	
	@Before
	public void initialize(){
		testUser = new UserImpl("Larry David");
		library = new LibraryImpl("Westmount Public Library");
	}
	
	@Test
	public void testsGettersLibrary(){
		assertEquals("Westmount Public Library", library.getLibrary());
	}
	
	@Test
	public void testsGetMaxBooksPerUser(){
		assertEquals(5, library.getMaxBooksPerUser());
	}
	
	@Test
	public void testsGetId(){
		library.register("Hank");
		assertEquals(2, library.getId("Holly"));
	}
	
	@Test
	public void testsAddBook(){
		library.addBook("Barry", "ABC");
		assertNotNull(library.takeBook("ABC"));
	}
	
	@Test
	public void testsTakeBook(){
		library.addBook("Barry", "ABC");
		assertTrue(library.takeBook("ABC").isTaken());
		
	}
	
	@Test
	public void testsReturnBook(){
		library.addBook("Barry", "ABC");
		Book testBook = library.takeBook("ABC");
		library.returnBook(testBook);
		assertFalse(testBook.isTaken());
	}
}
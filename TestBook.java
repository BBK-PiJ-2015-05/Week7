import org.junit.*;
import static org.junit.Assert.*;

/**
* Week 7 day 13
* Assignment 1. Practising TDD
* Sarah Connor
* Birkbeck Programming in Java 2015-2016
*/

public class TestBook{

	private BookImpl testBook;
	
	@Before
	public void initialize(){
		testBook = new BookImpl("Roald Dahl", "The Witches");
	}
	
	@Test
	public void testsGettersBook(){
		assertEquals("Roald Dahl", testBook.getAuthor());
		assertEquals("The Witches", testBook.getTitle());
	}

	@Test
	public void testsIsTaken(){
		assertFalse(testBook.isTaken());
	}
}
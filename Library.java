/**
* Week 7 day 13
* Assignment 1. Practising TDD
* Sarah Connor
* Birkbeck Programming in Java 2015-2016
*/

public interface Library{
	
	String getLibrary();
	
	int register(String name);

	int getMaxBooksPerUser();
	
	int getId(String name);
	
	void addBook(String title, String author);
	
	Book takeBook(String title) ;
	
	void returnBook(Book book);
	
	
}
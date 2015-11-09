/**
* Week 7 day 13
* Assignment 1. Practising TDD
* Sarah Connor
* Birkbeck Programming in Java 2015-2016
*/

public interface Library{
	
	/**
	* @return the library's name
	*/
	String getLibrary();
	
	/**
	* @param String name
	* creates a new user id and enters the name and id into a HashMap
	*/
	int register(String name);

	/**
	* 
	*/
	int getMaxBooksPerUser();
	
	/**
	* @return the id found in the HashMap matching the name
	* a new id is creating if the name is not already in the map
	*/
	int getId(String name);
	
	
	void addBook(String title, String author);
	
	Book takeBook(String title) ;
	
	void returnBook(Book book);
	
	
}
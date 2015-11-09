/**
* Week 7 day 13
* Assignment 1. Practising TDD
* Sarah Connor
* Birkbeck Programming in Java 2015-2016
*/

public class LibraryMock implements Library{
	private String library;
	private static int totalIds = 0;
	
	//constructor
	public LibraryMock(){
		this.library = "Westmount Public Library";
	}
	
	public String getLibrary(){
		return this.library;
	}
	
	public int register(String name){
		totalIds++;
		return totalIds;
	}
	
	public int getMaxBooksPerUser(){
		return 5;
	}
	
	public int getId(String name){
		return 1;
	}
	
	public void addBook(String title, String author){}
	
	public Book takeBook(String title){
		return new BookImpl("hey", "you");
	}
	
	public void returnBook(Book book){}
	
}
import java.util.HashMap;
/**
* Week 7 day 13
* Assignment 1. Practising TDD
* Sarah Connor
* Birkbeck Programming in Java 2015-2016
*/

public class LibraryImpl implements Library{
	private String library;
	private static int totalIds = 0;
	private HashMap<String, Integer> mapUserIds;
	
	//constructor
	public LibraryImpl(){
		this.library = "Westmount Public Library";
		this.mapUserIds = new HashMap<String, Integer>();
	}
	
	public String getLibrary(){
		return this.library;
	}
	
	public int register(String name){
		totalIds++;
		int id = totalIds;
		mapUserIds.put(name, id);
		return id;
	}
	
	public int getId(String name){
		int id = 0;
		if(mapUserIds.get(name) == null){
			id = register(name);
		}else{
			id = mapUserIds.get(name);
		}
		return id;
	}
	
	public int getMaxBooksPerUser(){
		return 5;
	}
	
	public void addBook(String title, String author){}
	
	public Book takeBook(String title){
		return new BookImpl("hey", "you");
	}
	
	public void returnBook(Book book){}
	
}
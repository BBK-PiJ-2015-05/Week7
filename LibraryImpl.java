import java.util.*;
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
	private ArrayList<Book> bookList;
	
	//constructor
	public LibraryImpl(String library){
		this.library = library;
		this.mapUserIds = new HashMap<String, Integer>();
		this.bookList = new ArrayList<Book>();
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
	
	public void addBook(String author, String title){
		Book newBook = new BookImpl(author, title);
		bookList.add(newBook);
	}
	
	public Book takeBook(String title){
		for(Book storedBook: bookList){
			String storedTitle = storedBook.getTitle();
			if(storedTitle.equals(title)){
				storedBook.setLoanStatus(true);
				return storedBook;
			}
		}
		return null;
	}
	
	public void returnBook(Book book){
		book.setLoanStatus(false);
	}
	
}
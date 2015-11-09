/**
* Week 7 day 13
* Assignment 1. Practising TDD
* Sarah Connor
* Birkbeck Programming in Java 2015-2016
*/

public class UserImpl implements User{
	
	private String name;
	private int id;
	private int booksLoaned;
	private Library library;
	
	//constructor
	public UserImpl(String name){
		this.name = name;
		this.id = 0;
		this.library = null;
		this.booksLoaned = 0;
	}
	
	//getters
	public String getName(){
		return this.name;
	}
	
	public int getId(){
		return this.id;
	}
	
	/**
	*@param Library a user registers with a library
	*@return the user's library id
	*/
	public int register(Library library){
		this.library = library;
		return library.getId(this.name);
	}
	
	/**
	*/
	public Library getLibrary(){
		return this.library;
	}
}
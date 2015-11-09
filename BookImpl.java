/**
* Week 7 day 13
* Assignment 1. Practising TDD
* Sarah Connor
* Birkbeck Programming in Java 2015-2016
*/

public class BookImpl implements Book{
	
	private final String author;
	private final String title;
	private boolean loanStatus;
	
	//constructor
	public BookImpl(String author, String title){
		this.author = author;
		this.title = title;
		this.loanStatus = false;
	}
	
	//getter
	public String getAuthor(){
		return this.author;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public boolean isTaken(){
		return this.loanStatus;
	}
	
	//setter
	public void setLoanStatus(boolean status){
		this.loanStatus = status;
	}
}
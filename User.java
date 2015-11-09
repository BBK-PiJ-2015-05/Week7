/**
* Week 7 day 13
* Assignment 1. Practising TDD
* Sarah Connor
* Birkbeck Programming in Java 2015-2016
*/

public interface User{
	
	//getters
	String getName();
	
	int getId();
	
	int register(Library library);
	
	Library getLibrary();
}
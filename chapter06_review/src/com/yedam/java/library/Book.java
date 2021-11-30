package com.yedam.java.library;

public class Book {
	//필드 
	int BookNo;
	String BookName;
	String Writter;;
	int RentalCount;
	String Rental;
	//책번호
	//책이름
	//지은이
	//대여횟수
	//대여유무
	
	
	//생성자
	public Book(String BookName, String Writter, String Rental, int RentalCount, int BookNo ) {
		
		this.BookName = BookName;
		this.BookNo = BookNo;
		this.Writter = Writter;
		this.RentalCount = 0;
	}
	
	
	
	
	
	//메소드
}

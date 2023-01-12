package com.bookreader.dashboard;

import com.bookreader.beans.Book;
import com.bookreader.beans.User;

public class Dashboard {

	private Book book;
	private User user;
	private int pageNumber = 0;
	
	public void displayUserInfo(User user) {
		this.user = user;
		userInfo();
	}
	
	public void userInfo() {
		System.out.println("Active user is :"+user.getName());
	}
	
	public void displayBookInfo(Book book) {
		this.book = book;
		bookInfo();
	}
	
	public void bookInfo() {
		System.out.println("Current book read by the user is :"+book.getTitle());
		System.out.println(book.getDetails());
		System.out.println("Page Number :"+pageNumber);
	}
	
	public void nextPage() {
		if(pageNumber == book.getNoOfPages()) {
			//throw exception
		}else {
			pageNumber++;
		}
		System.out.println("forwarding to next page : "+pageNumber);
	}
	
	public void previousPage() {
		if(pageNumber == 1) {
			//throw exception
		}else {
			pageNumber--;
		}
		System.out.println("coming to previous page :"+pageNumber);
	}
	
}

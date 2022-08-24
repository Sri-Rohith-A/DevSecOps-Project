package com.bookstore.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookstore.models.Book;

@Service
public interface BookService {

	public Book saveBook(Book book);
	
	public List<Book> getBooks();
	
	public void deleteBook(Integer Id);
	
}

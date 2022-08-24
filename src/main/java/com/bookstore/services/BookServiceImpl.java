package com.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.daos.BookRepository;
import com.bookstore.models.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository repository;
	
	@Override
	public Book saveBook(Book book) {
		return repository.save(book);
	}

	@Override
	public List<Book> getBooks() {
		return repository.findAll();
	}

	@Override
	public void deleteBook(Integer Id) {
		repository.deleteById(Id);
	}

}

package com.bookstore.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.models.Book;
import com.bookstore.services.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService service;

	@PostMapping("/books")
	public Book saveBook(@RequestBody Book book){
		return service.saveBook(book);
	}

	@GetMapping("/books")
	public List<Book> getBooks(){
		return service.getBooks();
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable Integer id) {
		service.deleteBook(id);
		return "Book "+id+" deleted successfully";
	}
}

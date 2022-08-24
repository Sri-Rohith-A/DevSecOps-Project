package com.bookstore.models;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;


@Entity(name="books")
public class Book {
    @Id
    private int id;
    private String name;
    private String authorName;
	public Book(int id, String name, String authorName) {
		super();
		this.id = id;
		this.name = name;
		this.authorName = authorName;
	}
	public Book() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
    
}

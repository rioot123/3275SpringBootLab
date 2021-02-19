package com.csis3275.sblab.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csis3275.sblab.entity.Book;

@Component
public class bookDAO {
	@Autowired
	private bookRepository repository;
	public  Collection<Book> getBooks(){
		return repository.findAll();
	}
	public void createBooks(Book book) {
		repository.insert(book);
	}
	public Book createBook(Book book) {
		 return repository.insert(book);
		}
}

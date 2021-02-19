package com.csis3275.sblab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csis3275.sblab.entity.Book;
import com.csis3275.sblab.service.bookService;

import java.util.Collection;
@RestController
@RequestMapping("/books")
public class bookController {
	
	
	private bookService bookService;
	@Autowired
	public bookController(bookService bookService) {
		this.bookService = bookService;
	}
	@GetMapping
	public Collection<Book> getBooks() {
		
		return bookService.getBooks();
	}
	@PostMapping()
	public Book postBook(@RequestBody Book book) {
	 return bookService.createBook(book);
	}
}

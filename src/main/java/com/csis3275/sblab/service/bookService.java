package com.csis3275.sblab.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csis3275.sblab.dao.bookDAO;
import com.csis3275.sblab.dao.bookRepository;
import com.csis3275.sblab.entity.Book;

import java.util.Collection;

@Service
public class bookService {
	@Autowired
	private bookDAO bDAO;
	private bookRepository bRepo;
	public Collection<Book> getBooks(){
		return bDAO.getBooks();
	}
	public Book createBook(Book book) {
		 return bRepo.insert(book);
		}
}

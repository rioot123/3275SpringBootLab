package com.csis3275.sblab.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Book")
public class Book {
private int id;
private String title;
private String Author;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
}

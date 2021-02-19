package com.csis3275.sblab.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.csis3275.sblab.entity.Book;
@Repository
public interface bookRepository extends MongoRepository<Book, Integer> {

}

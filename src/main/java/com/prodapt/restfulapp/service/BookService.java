package com.prodapt.restfulapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.prodapt.restfulapp.entities.Book;
@Component
public class BookService {
	private static List<Book> list=new ArrayList<>();
	static {
		list.add(new Book(12,"XYZ","Java Collections") );
		list.add(new Book(13,"ABC","Python LAnguage") );
		list.add(new Book(14,"DEF","JavaScript TUtorial") );
	}
	//get all books
	public List<Book> getAllBooks() {
		return list;
		
	}
	//get book by Id
	public Book getBookById(Integer id) {
		Book book=null;
		
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}

}

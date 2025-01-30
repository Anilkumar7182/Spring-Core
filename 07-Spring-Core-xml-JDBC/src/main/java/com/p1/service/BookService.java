package com.p1.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.entity.Book;
import com.p1.entity.repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	private final BookRepo bookRepo;
	
	public BookService(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	
	
	public void ReadAndInsertBook() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Book Name:");
		String name = scanner.nextLine();
		
		System.out.println("Enter Book Author:");
		String author = scanner.nextLine();
		
		System.out.println("Enter Book Price");
		String price = scanner.nextLine();
		
		Book book = new Book();
		book.setName(name);
		book.setAuthor(author);
		book.setPrice(price);
		
		bookRepo.insert(book);
		
		System.out.println("Book inserted Succcessfully...");
	}

}

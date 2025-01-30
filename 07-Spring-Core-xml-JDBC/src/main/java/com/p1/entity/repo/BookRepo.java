package com.p1.entity.repo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.p1.entity.Book;

@Repository
public class BookRepo {
	
	private final JdbcTemplate jdbcTemplate;
	
	public BookRepo(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public void insert(Book book) {
		String sql ="INSERT INTO BOOKS( name , author , price) VALUES ( ? , ? , ? )";
		jdbcTemplate.update(sql,book.getName(),book.getAuthor(),book.getPrice());
		
	}
	
	// Create table if not exists
	public void init() {
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS books (id INTEGER PRIMARY KEY, name VARCHAR(255), author VARCHAR(255), price VARCHAR(255)");
	}
}

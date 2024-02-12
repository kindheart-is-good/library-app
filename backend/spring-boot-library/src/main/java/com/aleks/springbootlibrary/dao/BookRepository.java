package com.aleks.springbootlibrary.dao;

import com.aleks.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> { // 2nd arg = type of primary key for book (private Long id)
}

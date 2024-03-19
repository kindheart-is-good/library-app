package com.aleks.springbootlibrary.dao;

import com.aleks.springbootlibrary.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface BookRepository extends JpaRepository<Book, Long> { // 2nd arg = type of primary key for book (private Long id)

        /* if look at the JpaRepository, it contains different methods for working with the database, but it does not contain a search.
        * And that's okay, because SpringBoot makes it super easy for developers to be able to implement new APIs.*/
    Page<Book> findByTitleContaining(@RequestParam("title") String title, Pageable pageable);
        // String title in the HTTP-request looks like this: findByTitleContaining?title=guru
        // Pagable in the HTTP-request looks like this: &page=0&size=5
}

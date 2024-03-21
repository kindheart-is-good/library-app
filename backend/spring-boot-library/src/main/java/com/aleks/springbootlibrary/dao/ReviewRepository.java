package com.aleks.springbootlibrary.dao;

import com.aleks.springbootlibrary.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}

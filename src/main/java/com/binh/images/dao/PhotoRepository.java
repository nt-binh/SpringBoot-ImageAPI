package com.binh.images.dao;

import com.binh.images.domain.entity.Photo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface PhotoRepository extends JpaRepository<Photo, Long>, QueryDslPredicateExecutor<Photo> {

}

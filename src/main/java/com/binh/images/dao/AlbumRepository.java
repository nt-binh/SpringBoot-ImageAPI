package com.binh.images.dao;

import com.binh.images.domain.entity.Album;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface AlbumRepository extends JpaRepository<Album, Long>, QueryDslPredicateExecutor<Album> {

}

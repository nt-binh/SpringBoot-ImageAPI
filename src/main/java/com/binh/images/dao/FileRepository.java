package com.binh.images.dao;

import com.binh.images.domain.entity.File;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {

  public File findByFilename(String filename);

}

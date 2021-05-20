package com.binh.images.service;

import com.binh.images.domain.entity.Album;
import com.binh.images.model.json.request.AlbumRequest;

import org.springframework.data.domain.Pageable;

public interface AlbumService {

  Album createAlbum(AlbumRequest albumRequest);

  Album getAlbumById(Long id);

  Iterable<Album> getAlbums(String search, Pageable pageable);

  Album updateAlbum(Long id, AlbumRequest albumRequest);

  void deleteAlbum(Long id);

}

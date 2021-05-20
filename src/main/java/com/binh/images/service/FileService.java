package com.binh.images.service;

public interface FileService {

  public byte[] serveFile(String filename);

  public void deleteFile(Long id);

}

package com.neeraj.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface CloudinaryImageService {
	
	Map<String, String> upload(MultipartFile file);
}

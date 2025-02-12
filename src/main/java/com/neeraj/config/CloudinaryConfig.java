package com.neeraj.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;

@Configuration
public class CloudinaryConfig {
	
	@Value("${cloud.name}")
	String coundName;
	
	@Value("${api.key}")
	String apiKey;
	
	@Value("${api.secret}")
	String apiSecret;
	
	@Bean
	public Cloudinary getCloudinary() {
		Map<String, String> config = new HashMap<>();
		config.put("cloud_name", coundName);
		config.put("api_key", apiKey);
		config.put("api_secret", apiSecret);
		config.put("secure", "true");
		return new Cloudinary(config);
	}
	
}

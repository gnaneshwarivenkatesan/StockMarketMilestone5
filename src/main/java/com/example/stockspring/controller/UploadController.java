package com.example.stockspring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.stockspring.model.StockPrice;
import com.example.stockspring.service.UploadService;



@RestController
public class UploadController {
	@Autowired
	private UploadService uploadService;

	@PostMapping("/upload")
	public List<StockPrice> upload(@RequestParam("file") MultipartFile file) throws Exception {
		return uploadService.upload(file);
	}
}

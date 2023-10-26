package com.itvedant.spring_project.controllers;

import org.springframework.core.io.Resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.itvedant.spring_project.services.ProductService;



@RestController
public class ProductController 
{
    @Autowired
    private ProductService productService;

    @PutMapping("/products/{id}/upload")
    public ResponseEntity<?> upload(@PathVariable Integer id,@RequestParam("file")MultipartFile file)
        {
            return ResponseEntity.ok(productService.storeFile(id,file));
        }
        
    @GetMapping("/products/download/{filename}")
    public ResponseEntity<?> download(@PathVariable String filename)
{
        Resource resource = this.productService.downloadFile(filename);

        return ResponseEntity.ok()
                             .header(HttpHeaders.CONTENT_DISPOSITION,
                                "attachment;filename=\"" + filename + "\"")
                             .body(resource);
    }
    }


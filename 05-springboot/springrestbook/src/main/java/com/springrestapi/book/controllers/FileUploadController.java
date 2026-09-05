package com.springrestapi.book.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springrestapi.book.helper.FileUploadHelper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FileUploadController {

    private final FileUploadHelper fileUploadHelper;

    FileUploadController(FileUploadHelper fileUploadHelper) {
        this.fileUploadHelper = fileUploadHelper;
    }

    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        // System.out.println(file.getOriginalFilename());
        // System.out.println(file.getSize());
        // System.out.println(file.getContentType());
        // System.out.println(file.getName());

        if(file.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Request must contains file");

        }

        //file upload code

        fileUploadHelper.uploadFile(file);


        return ResponseEntity.ok("File is successfully uploaded...");
    }

}

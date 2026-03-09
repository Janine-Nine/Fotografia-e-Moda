package com.fotomoda.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api/upload")
public class UploadController {

@PostMapping
public String upload(@RequestParam("file") MultipartFile file) throws IOException {

String pasta = "uploads/";

File destino = new File(pasta + file.getOriginalFilename());

file.transferTo(destino);

return destino.getAbsolutePath();
}

}
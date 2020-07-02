package com.soukaina.uploader.Controllers;
import com.soukaina.uploader.Services.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files")
public class HomeControlller {

    private final StorageService storageService;
    @Autowired
    public HomeControlller(StorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping("/upload")
    public boolean handleFileUpload(@RequestParam("file") MultipartFile file) {
        storageService.store(file);
        return true;
    }

}

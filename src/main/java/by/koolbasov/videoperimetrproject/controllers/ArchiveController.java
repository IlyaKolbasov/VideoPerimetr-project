package by.koolbasov.videoperimetrproject.controllers;

import by.koolbasov.videoperimetrproject.dto.ArchiveInfoDto;
import by.koolbasov.videoperimetrproject.service.ArchiveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArchiveController {
    @Autowired
    ArchiveInfoService archiveInfoService;
    @PostMapping(path = "https://videoperimetr.onrender.com/mainpage")
    public String addArchive(@RequestBody ArchiveInfoDto ArchiveInfodto) {
        archiveInfoService.saveArchiveInfo(ArchiveInfodto);
        return "New request";
    }


}

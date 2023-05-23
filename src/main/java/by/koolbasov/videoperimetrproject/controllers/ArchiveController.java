package by.koolbasov.videoperimetrproject.controllers;

import by.koolbasov.videoperimetrproject.entity.ArchiveInfo;
import by.koolbasov.videoperimetrproject.service.ArchiveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ArchiveController {
    @Autowired
    ArchiveInfoService archiveInfoService;
    @PostMapping(path = "/mainpage")
    public String addUser(@RequestBody ArchiveInfo newArchiveInfo) {
        archiveInfoService.saveArchiveInfo(newArchiveInfo);
        return "New request";
    }
}

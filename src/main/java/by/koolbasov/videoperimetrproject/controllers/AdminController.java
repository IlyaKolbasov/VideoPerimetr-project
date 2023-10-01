package by.koolbasov.videoperimetrproject.controllers;

import by.koolbasov.videoperimetrproject.dto.ArchiveInfoDto;
import by.koolbasov.videoperimetrproject.service.ArchiveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private ArchiveInfoService archiveInfoService;

    @GetMapping(path = "/admin")
    public ResponseEntity<List<ArchiveInfoDto>> getArchiveInfo(){
        return ResponseEntity.ok(archiveInfoService.getAllArchiveInfoDto());
    }
    @DeleteMapping(path = "/admin/delete")
    public void deleteArchiveInfo(@PathVariable Long id){
        archiveInfoService.delete(id);
    }
}

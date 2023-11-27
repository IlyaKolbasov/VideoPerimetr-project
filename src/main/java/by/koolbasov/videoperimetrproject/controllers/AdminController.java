package by.koolbasov.videoperimetrproject.controllers;

import by.koolbasov.videoperimetrproject.dto.ArchiveInfoDto;
import by.koolbasov.videoperimetrproject.service.ArchiveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private ArchiveInfoService archiveInfoService;

    @GetMapping(path = "/admin")
    public ResponseEntity<List<ArchiveInfoDto>> getArchiveInfo(){
        return ResponseEntity.ok(archiveInfoService.getAllArchiveInfoUnProcessedDto());
    }
    @GetMapping(path = "/admin/isProcessing")
    public ResponseEntity<List<ArchiveInfoDto>> getArchiveInfoisProcessing(){
        return ResponseEntity.ok(archiveInfoService.getAllArchiveInfoIsProcessingDto());
    }
    @PutMapping(path="/admin/updatestatus")
    public void upDateStatus(@RequestParam("id") Long id){
        archiveInfoService.upDateStatus(id);
    }
    @DeleteMapping(path = "/admin/delete")
    public void deleteArchiveInfo(@RequestParam("id") Long id){
        archiveInfoService.delete(id);
    }
}

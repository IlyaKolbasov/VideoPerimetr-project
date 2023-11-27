package by.koolbasov.videoperimetrproject.service;

import by.koolbasov.videoperimetrproject.dto.ArchiveInfoDto;

import java.util.List;

public interface ArchiveInfoService {
    void saveArchiveInfo(ArchiveInfoDto archiveInfodto);
    void delete (Long id);
    void upDateStatus(Long id);
    List<ArchiveInfoDto> getAllArchiveInfoUnProcessedDto();

    List<ArchiveInfoDto> getAllArchiveInfoIsProcessingDto();
}

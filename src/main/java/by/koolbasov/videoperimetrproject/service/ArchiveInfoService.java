package by.koolbasov.videoperimetrproject.service;

import by.koolbasov.videoperimetrproject.dto.ArchiveInfoDto;

import java.util.List;

public interface ArchiveInfoService {
    void saveArchiveInfo(ArchiveInfoDto archiveInfodto);

    List<ArchiveInfoDto> getAllArchiveInfoDto();

}

package by.koolbasov.videoperimetrproject.service.impl;

import by.koolbasov.videoperimetrproject.entity.ArchiveInfo;
import by.koolbasov.videoperimetrproject.repository.ArchiveInfoRepository;
import by.koolbasov.videoperimetrproject.service.ArchiveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArchiveInfoServiceImpl implements ArchiveInfoService {

    @Autowired
    private ArchiveInfoRepository archiveInfoRepository;
    @Override
    public void saveArchiveInfo(ArchiveInfo archiveInfo) {
        archiveInfoRepository.save(archiveInfo);
    }
}

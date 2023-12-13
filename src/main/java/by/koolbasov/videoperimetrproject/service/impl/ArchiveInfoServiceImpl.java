package by.koolbasov.videoperimetrproject.service.impl;

import by.koolbasov.videoperimetrproject.dto.ArchiveInfoDto;
import by.koolbasov.videoperimetrproject.entity.Address;
import by.koolbasov.videoperimetrproject.entity.ArchiveInfo;
import by.koolbasov.videoperimetrproject.mapper.AddressMapper;
import by.koolbasov.videoperimetrproject.mapper.ArchiveInfoMapper;
import by.koolbasov.videoperimetrproject.repository.AddressRepository;
import by.koolbasov.videoperimetrproject.repository.ArchiveInfoRepository;
import by.koolbasov.videoperimetrproject.repository.UserRepository;
import by.koolbasov.videoperimetrproject.service.ArchiveInfoService;
import by.koolbasov.videoperimetrproject.table.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ArchiveInfoServiceImpl implements ArchiveInfoService {

    @Autowired
    private ArchiveInfoRepository archiveInfoRepository;

    @Override
    public void saveArchiveInfo(ArchiveInfoDto archiveInfodto) {
//        var archiveInfo = ArchiveInfo.builder()
//                .firstName(archiveInfodto.getFirstName())
//                .lastName(archiveInfodto.getLastName())
//                .number(archiveInfodto.getNumber())
//                .fromDate(archiveInfodto.getFromDate())
//                .toDate(archiveInfodto.getToDate())
//                .fromTime(archiveInfodto.getFromTime())
//                .toTime(archiveInfodto.getToTime())
//                .build();
        archiveInfoRepository.save(ArchiveInfoMapper.MAPPER.toArchiveInfo(archiveInfodto));

    }

    @Override
    public void delete(Long id) {
        archiveInfoRepository.deleteById(id);
    }

    @Override
    public void upDateStatus(Long id) {
       archiveInfoRepository.upDateStatus(id, Status.isProcessing);
    }

    @Override
    public List<ArchiveInfoDto> getAllArchiveInfoUnProcessedDto() {
       return ArchiveInfoMapper.MAPPER.toArchiveInfoListDto(archiveInfoRepository.findAllByStatus(Status.unProcessed));
    }

    @Override
    public List<ArchiveInfoDto> getAllArchiveInfoIsProcessingDto() {
        return ArchiveInfoMapper.MAPPER.toArchiveInfoListDto(archiveInfoRepository.findAllByStatus(Status.isProcessing));
    }


}

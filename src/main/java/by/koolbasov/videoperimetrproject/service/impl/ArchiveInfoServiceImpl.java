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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ArchiveInfoServiceImpl implements ArchiveInfoService {

    @Autowired
    private ArchiveInfoRepository archiveInfoRepository;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;
    @Override
    public void saveArchiveInfo(ArchiveInfoDto archiveInfodto) {
        Address address = AddressMapper.INSTANCE.toAddress(archiveInfodto.getAddressDto());
        addressRepository.save(address);
        var archiveInfo = ArchiveInfo.builder()
                .firstName(archiveInfodto.getFirstName())
                .lastName(archiveInfodto.getLastName())
                .number(archiveInfodto.getNumber())
                .fromDate(archiveInfodto.getFromDate())
                .toDate(archiveInfodto.getToDate())
                .fromTime(archiveInfodto.getFromTime())
                .toTime(archiveInfodto.getToTime())
                .address(address)
                .build();
        archiveInfoRepository.save(archiveInfo);
    }

    @Override
    public List<ArchiveInfoDto> getAllArchiveInfoDto() {
       return ArchiveInfoMapper.MAPPER.toArchiveInfoListDto(archiveInfoRepository.findAll());
    }


}

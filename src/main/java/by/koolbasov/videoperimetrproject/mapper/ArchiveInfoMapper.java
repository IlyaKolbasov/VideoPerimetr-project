package by.koolbasov.videoperimetrproject.mapper;

import by.koolbasov.videoperimetrproject.dto.AddressDto;
import by.koolbasov.videoperimetrproject.dto.ArchiveInfoDto;
import by.koolbasov.videoperimetrproject.entity.Address;
import by.koolbasov.videoperimetrproject.entity.ArchiveInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "default", uses={AddressMapper.class})
@Component
public interface ArchiveInfoMapper {

   ArchiveInfoMapper MAPPER = Mappers.getMapper( ArchiveInfoMapper.class );
   @Mapping(source = "address", target = "addressDto")
   ArchiveInfoDto toArchiveInfoDto(ArchiveInfo archiveInfo);

    ArchiveInfo toArchiveInfo(ArchiveInfoDto archiveInfoDto);

    List<ArchiveInfoDto> toArchiveInfoListDto(List<ArchiveInfo> archiveInfoList);
}

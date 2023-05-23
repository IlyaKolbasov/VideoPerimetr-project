package by.koolbasov.videoperimetrproject.mapper;

import by.koolbasov.videoperimetrproject.dto.ArchiveInfoDto;
import by.koolbasov.videoperimetrproject.entity.ArchiveInfo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ArchiveInfoMapper {

    ArchiveInfoDto toDto(ArchiveInfo archiveInfo);
    List<ArchiveInfoDto> toDtoList(List<ArchiveInfo> archiveInfoList);
}

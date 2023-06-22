package by.koolbasov.videoperimetrproject.mapper;

import by.koolbasov.videoperimetrproject.dto.AddressDto;
import by.koolbasov.videoperimetrproject.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address toAddress(AddressDto addressDto);

    AddressDto toAddressDto(Address address);

}


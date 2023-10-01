package by.koolbasov.videoperimetrproject.dto;

import by.koolbasov.videoperimetrproject.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArchiveInfoDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private String buildingNumber;
    private String flatNumber;
    private String number;
    private String email;
    private String fromTime;
    private String fromDate;
    private String toTime;
    private String toDate;
}

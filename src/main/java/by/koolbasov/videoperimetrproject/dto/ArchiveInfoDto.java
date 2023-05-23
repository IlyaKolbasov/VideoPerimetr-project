package by.koolbasov.videoperimetrproject.dto;

import lombok.Data;

@Data
public class ArchiveInfoDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private String buildingNumber;
    private String flatNumber;
    private String number;
    private String fromTime;
    private String fromDate;
    private String toTime;
    private String toDate;
}
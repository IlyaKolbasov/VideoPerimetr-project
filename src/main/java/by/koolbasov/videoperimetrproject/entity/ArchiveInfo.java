package by.koolbasov.videoperimetrproject.entity;


import by.koolbasov.videoperimetrproject.table.Role;
import by.koolbasov.videoperimetrproject.table.Status;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table()
public class ArchiveInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Enumerated(EnumType.STRING)
    private Status status=Status.unProcessed;



}

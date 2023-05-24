package by.koolbasov.videoperimetrproject.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ArchiveInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String number;
    private String fromTime;
    private String fromDate;
    private String toTime;
    private String toDate;

    @OneToOne
    @JoinColumn (name = "address_id")
    private Address address;

    public ArchiveInfo() {
    }
}

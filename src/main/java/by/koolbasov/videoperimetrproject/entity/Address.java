package by.koolbasov.videoperimetrproject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionType;

import java.util.*;

@Entity
@Table(name = "address")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String street;
    private String houseNum;
    private int flatNum;

    @OneToOne(mappedBy = "address")
    private User owner;

    @OneToOne(mappedBy = "address")
    private ArchiveInfo archiveInfo;

}

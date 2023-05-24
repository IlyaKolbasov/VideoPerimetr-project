package by.koolbasov.videoperimetrproject.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CollectionType;

import java.util.*;

@Entity
@Table(name = "address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String city;
    private String street;
    private String houseNum;
    @ElementCollection
    private List<Integer> flat_Num;

   @OneToOne(mappedBy = "address")
    private User owner;

  @OneToOne(mappedBy = "address")
    private ArchiveInfo archiveInfo;

}

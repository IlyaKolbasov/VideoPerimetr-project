package by.koolbasov.videoperimetrproject.service;

import by.koolbasov.videoperimetrproject.entity.Address;

import java.util.*;

public interface AddressService {
    void save(Address address);

    Set<String> findAllCity();

    List <Address> findAddressesByCity(String city);
}

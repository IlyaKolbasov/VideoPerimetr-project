package by.koolbasov.videoperimetrproject.service.impl;

import by.koolbasov.videoperimetrproject.entity.Address;
import by.koolbasov.videoperimetrproject.repository.AddressRepository;
import by.koolbasov.videoperimetrproject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void save(Address address) {
        addressRepository.save(address);
    }

    @Override
    public Set<String> findAllCity() {
        return addressRepository.findAllCity();
    }

    @Override
    public List<Address> findAddressesByCity(String city) {
        return addressRepository.findAddressesByCity(city);
    }
}

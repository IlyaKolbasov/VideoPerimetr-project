package by.koolbasov.videoperimetrproject.controllers;

import by.koolbasov.videoperimetrproject.entity.Address;
import by.koolbasov.videoperimetrproject.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
@Controller
public class AddressController {
    @Autowired
    private AddressServiceImpl addressService;

    @GetMapping("/")
    public ResponseEntity<Set<String>> getCity() {
        return ResponseEntity.ok(addressService.findAllCity());
    }

    @PostMapping("/")
    public ResponseEntity<List<Address>> getAddress(@RequestBody String city) {
        return ResponseEntity.ok(addressService.findAddressesByCity(city));
    }

}

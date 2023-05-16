package com.geekster.Mapping_Practice.controllers;

import com.geekster.Mapping_Practice.models.Address;
import com.geekster.Mapping_Practice.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("addAddress")
    public void addAddress(@PathVariable Address address){
         addressService.addAddress(address);
    }

    @GetMapping("getAddressById/{id}")
            public Address getAddress(@PathVariable Long id){
       return addressService.getAddressByID(id);
    }



}

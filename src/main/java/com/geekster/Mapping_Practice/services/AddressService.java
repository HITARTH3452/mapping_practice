package com.geekster.Mapping_Practice.services;

import com.geekster.Mapping_Practice.models.Address;
import com.geekster.Mapping_Practice.repositries.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;
    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public Address getAddressByID(Long id) {
        return addressRepo.getById(id);
    }
}

package com.example.springvirtualthreads.controller;

import com.example.springvirtualthreads.entity.Address;
import com.example.springvirtualthreads.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
class AddressController {

    private final AddressService addressService;

    @GetMapping("addresses/{cep}")
    ResponseEntity<Address> getAddress(@PathVariable final String cep) {
        return ResponseEntity.ok(addressService.getAddress(cep));
    }
}
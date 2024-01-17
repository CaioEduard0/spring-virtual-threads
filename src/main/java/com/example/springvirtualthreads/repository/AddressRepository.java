package com.example.springvirtualthreads.repository;

import com.example.springvirtualthreads.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {}
package com.storemanagement.storemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.storemanagement.storemanagement.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}

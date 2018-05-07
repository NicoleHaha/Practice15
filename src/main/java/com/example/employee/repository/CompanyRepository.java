package com.example.employee.repository;

import com.example.employee.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CompanyRepository extends JpaRepository<Company,Long> {
    Company findById(int id);
}

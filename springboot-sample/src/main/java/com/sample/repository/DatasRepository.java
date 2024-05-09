package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.model.Register;

public interface BasicdataRepository extends JpaRepository<Register,Integer>
{

}
package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.model.BasicData;

public interface BasicdataRepository extends JpaRepository<BasicData,Integer>
{

}
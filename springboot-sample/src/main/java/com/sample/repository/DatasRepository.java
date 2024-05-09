package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.model.Datas;

public interface DatasRepository extends JpaRepository<Datas,Integer>{

}
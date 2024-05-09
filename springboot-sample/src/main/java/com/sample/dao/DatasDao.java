package com.sample.dao;

import java.util.List;
import java.util.Optional;

import com.sample.model.Register;

public interface BasicdataDao
{
	List<Register> findAll();
	Register save(Register data);
	Optional<Register> findById(Integer regId);
}

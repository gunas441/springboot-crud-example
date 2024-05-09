package com.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sample.dao.BasicdataDao;
import com.sample.model.Register;

@Service
public class BasicdataServiceImpl implements BasicdataService
{
	@Autowired
	BasicdataDao basicdataDao;
	
	@Override
	public List<Register> findAll() {
		return basicdataDao.findAll();
	}

	@Override
	public Register save(Register data) {
		return basicdataDao.save(data);
	}

	@Override
	public Optional<Register> findById(Integer regId) {
		return basicdataDao.findById(regId);
	}
}

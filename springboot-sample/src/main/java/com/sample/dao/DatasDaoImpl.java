package com.sample.dao;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sample.model.Register;
import com.sample.repository.BasicdataRepository;

@Transactional
@Repository
public class BasicdataDaoImpl implements BasicdataDao 
{
	@Autowired
	DataSource dataSource;
	
	@Autowired
	BasicdataRepository basicdataRepository;
	
	@Override
	public List<Register> findAll() {
		return basicdataRepository.findAll();
	}

	@Override
	public Register save(Register data) {
		return basicdataRepository.save(data);
	}

	@Override
	public Optional<Register> findById(Integer regId) {
		return basicdataRepository.findById(regId);
	}
}

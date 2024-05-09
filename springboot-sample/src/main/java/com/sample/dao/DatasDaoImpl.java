package com.sample.dao;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sample.model.Datas;
import com.sample.repository.DatasRepository;

@Transactional
@Repository
public class DatasDaoImpl implements DatasDao 
{
	@Autowired
	DataSource dataSource;
	
	@Autowired
	DatasRepository basicdataRepository;
	
	@Override
	public List<Datas> findAll() {
		return basicdataRepository.findAll();
	}

	@Override
	public Datas save(Datas data) {
		return basicdataRepository.save(data);
	}

	@Override
	public Optional<Datas> findById(Integer regId) {
		return basicdataRepository.findById(regId);
	}
}

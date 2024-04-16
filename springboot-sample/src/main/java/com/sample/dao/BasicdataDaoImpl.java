package com.sample.dao;

import jakarta.transaction.Transactional;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sample.model.BasicData;
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
	public List<BasicData> findAll() {
		return basicdataRepository.findAll();
	}

	@Override
	public BasicData save(BasicData data) {
		return basicdataRepository.save(data);
	}
}

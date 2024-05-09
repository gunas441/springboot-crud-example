package com.sample.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sample.dao.DatasDao;
import com.sample.model.Datas;

@Service
public class DatasServiceImpl implements DatasService
{
	@Autowired
	DatasDao basicdataDao;
	
	@Override
	public List<Datas> findAll() {
		return basicdataDao.findAll();
	}

	@Override
	public Datas save(Datas data) {
		return basicdataDao.save(data);
	}

	@Override
	public Optional<Datas> findById(Integer regId) {
		return basicdataDao.findById(regId);
	}
}

package com.sample.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sample.dao.BasicdataDao;
import com.sample.model.BasicData;

@Service
public class BasicdataServiceImpl implements BasicdataService
{
	@Autowired
	BasicdataDao basicdataDao;
	
	@Override
	public List<BasicData> findAll() {
		return basicdataDao.findAll();
	}

	@Override
	public BasicData save(BasicData data) {
		return basicdataDao.save(data);
	}
}

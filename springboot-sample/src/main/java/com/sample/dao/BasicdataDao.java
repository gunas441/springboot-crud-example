package com.sample.dao;

import java.util.List;
import com.sample.model.BasicData;

public interface BasicdataDao
{
	List<BasicData> findAll();
	BasicData save(BasicData data);
}

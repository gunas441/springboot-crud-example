package com.sample.service;

import java.util.List;
import com.sample.model.BasicData;

public interface BasicdataService
{
	List<BasicData> findAll();
	BasicData save(BasicData data);
}

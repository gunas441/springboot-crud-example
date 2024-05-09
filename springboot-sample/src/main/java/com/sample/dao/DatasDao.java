package com.sample.dao;

import java.util.List;
import java.util.Optional;
import com.sample.model.Datas;

public interface DatasDao
{
	List<Datas> findAll();
	Datas save(Datas data);
	Optional<Datas> findById(Integer regId);
}

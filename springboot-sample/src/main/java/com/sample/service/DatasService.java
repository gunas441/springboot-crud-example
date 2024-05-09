package com.sample.service;

import java.util.List;
import java.util.Optional;
import com.sample.model.Datas;

public interface DatasService {
	List<Datas> findAll();
	Datas save(Datas data);
	Optional<Datas> findById(Integer regId);
}

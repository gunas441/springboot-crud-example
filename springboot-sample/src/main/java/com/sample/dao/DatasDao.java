package com.sample.dao;

import java.util.List;
import java.util.Optional;
<<<<<<< HEAD
import com.sample.model.Datas;

public interface DatasDao
=======
import com.sample.model.Register;

public interface BasicdataDao
>>>>>>> 7fb3e37ae16ba7e54f4a36e0ac0ba402b262e578
{
	List<Datas> findAll();
	Datas save(Datas data);
	Optional<Datas> findById(Integer regId);
}

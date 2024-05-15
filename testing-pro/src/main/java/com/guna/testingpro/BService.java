package com.guna.testingpro;

import java.util.List;

public interface BService {

	List<Basic> findAll();
	Basic save(Basic basic);
	List<Basic> findByfullname(String fullname);
	void deleteById(Integer id);

}

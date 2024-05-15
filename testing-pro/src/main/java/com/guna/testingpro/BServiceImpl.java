package com.guna.testingpro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BServiceImpl implements BService{

	@Autowired
	BRepository bRepository;
	
	@Autowired
	DataSource datasource;
	
	@Override
	public List<Basic> findAll() {
		return bRepository.findAll();
	}

	@Override
	public Basic save(Basic basic) {
		return bRepository.save(basic);
	}

	@Override
	public List<Basic> findByfullname(String fullname) {
		List<Basic> basicArray = new ArrayList<>();
		JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
		String sql = "select sum(salary*12) as CTC,fullname from basic where fullname=?";
		List<Map<String,Object>> list = jdbcTemplate.queryForList(sql,fullname);
		for(Map<String,Object> row : list) {
			Basic b = new Basic();
			b.setFullname(Util.parseNull(row.get("fullname")));
			b.setSalaryPerYear(Integer.parseInt(Util.parseZero(row.get("CTC"))));
			basicArray.add(b);
		}
		return basicArray;
	}

	@Override
	public void deleteById(Integer id) {
		bRepository.deleteById(id);
	}

}

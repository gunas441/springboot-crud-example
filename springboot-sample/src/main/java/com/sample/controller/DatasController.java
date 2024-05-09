package com.sample.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sample.model.Datas;
import com.sample.service.DatasService;

@RestController
public class DatasController
{
	@Autowired
	DatasService basicDataService;

    @GetMapping("/list")
	public List<Datas> getAllData() {
		return basicDataService.findAll();
	}

    @GetMapping("/byId/{regId}")
    public Optional<Datas> getById(@PathVariable Integer regId){
		return basicDataService.findById(regId);
    }

    @PostMapping("/save")
    public Datas create(@RequestBody Datas data) {
    	Datas senddata = basicDataService.save(data);
    	return senddata;
    }
}

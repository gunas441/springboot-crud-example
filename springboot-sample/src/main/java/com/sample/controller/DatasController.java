package com.sample.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sample.model.Register;
import com.sample.service.BasicdataService;

@CrossOrigin("*")
@RestController  
public class BasicdataController 
{
	@Autowired
	BasicdataService basicDataService;
    
    @GetMapping("/list")
	public List<Register> getAllData() {
		return basicDataService.findAll();   
	}
    
    @GetMapping("/byId/{regId}")
    public Optional<Register> getById(@PathVariable Integer regId){
		return basicDataService.findById(regId);
    }
    
    @PostMapping("/save")
    public Register create(@RequestBody Register data) {
    	Register senddata = basicDataService.save(data);
    	return senddata;	
    }
    
    
    
}

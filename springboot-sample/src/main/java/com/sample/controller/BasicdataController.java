package com.sample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sample.model.BasicData;
import com.sample.service.BasicdataService;

@RestController  
public class BasicdataController 
{
	@Autowired
	BasicdataService basicDataService;
    
	/* AUTHOR : GUNASEKARAN
	 * DATE   : 27-02-2024 */
    @GetMapping("/list")
	public List<BasicData> getAllData() {
		return basicDataService.findAll();   
	}
    
    /* AUTHOR : GUNASEKARAN
	 * DATE   : 13-03-2024 */
    @PostMapping("/save")
    public BasicData create(@RequestBody BasicData data) {
    	BasicData senddata = basicDataService.save(data);
    	return senddata;	
    }
    
    
    
}

package com.guna.testingpro;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class BController {

	@Autowired
	BService bService;
	
	@GetMapping("/list")
	public List<Basic> getAll(){
		return bService.findAll();
	}
	
	@PostMapping("/create")
	public Basic create(@RequestBody Basic basic) {
		Basic basicData = bService.save(basic);
		return basicData;
	}
	
	@GetMapping("/findctcbyname/{fullname}")
	public List<Basic> getByName(@PathVariable String fullname){
		return bService.findByfullname(fullname);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		bService.deleteById(id);
	}
	
}

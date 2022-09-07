package com.cg.ps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlacementController {

	@Autowired
	private PlacementService service;
	
	// Retrieve all
	@GetMapping("/Placement")
	public List<Placement> list(){
		return service.listAll();
		
	}
	// Retrieve by ID
	@GetMapping("/Placement/{id}")
	public ResponseEntity <Placement> get(@PathVariable Integer id) {
		try {
			Placement placement = service.get(id);
			return new ResponseEntity<Placement>(placement,HttpStatus.OK);
		} 
		catch (Exception e)
		{	
		return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
		
		// create
	@PostMapping("/Placement/{id}")	
	public void add(@RequestBody Placement placement) {
		service.save(placement);
	}
	// update
	@PutMapping("/Placement/{id}")
	public ResponseEntity<?> update(@RequestBody Placement placement,@PathVariable Integer id){	
	try {
		Placement existplacement = service.get(id);
		service.save(placement);
		return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	
	// delete
	@DeleteMapping("/Placement/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}


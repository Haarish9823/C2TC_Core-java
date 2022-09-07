package com.cg.ps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlacementService {
	
	@Autowired
	private PlacementRepository repo;
	// retrieve all
	public List<Placement> listAll(){
		return repo.findAll();
		
	}
	// retrieve by id
	public Placement get(Integer id) {
		return repo.findById(id).get();
	}
	// create
	public void save(Placement placement) {
		repo.save(placement);
	}
	// delete
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	}



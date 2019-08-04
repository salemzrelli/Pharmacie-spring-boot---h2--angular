package com.hc.jee.pharma.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hc.jee.pharma.model.PharmacieEnService;
import com.hc.jee.pharma.repository.PharmacieRepository;

@RestController
@CrossOrigin
public class PharmaController {

	@Autowired
	PharmacieRepository pharmacieRepository;

	@GetMapping("/pharmacies")
	public List<PharmacieEnService> getAll() {
		return (List<PharmacieEnService>) pharmacieRepository.findAll();
	}
	
	@GetMapping("/pharmacies/{id}")
	public PharmacieEnService getPharmacieEnService(@PathVariable long id){
		return pharmacieRepository.findById(id).get();
	 
	}

	@DeleteMapping("/pharmacies/{id}")
	public ResponseEntity<Void> deletePharma(@PathVariable long id) {

		pharmacieRepository.deleteById(id);

		return ResponseEntity.noContent().build();

	}

	@PutMapping("/pharmacies/{id}")
	public ResponseEntity<PharmacieEnService> updatePharmacie(@PathVariable long id, @RequestBody PharmacieEnService pharmacie) {

		PharmacieEnService pharmacieUpdate = pharmacieRepository.save(pharmacie);

		return new ResponseEntity<PharmacieEnService>(pharmacie, HttpStatus.OK);
	}
	
	
	@PostMapping("/pharmacies")
	public void  creatPharmacie(@RequestBody PharmacieEnService pharmacie)
	{
		pharmacieRepository.save(pharmacie);
	}

}

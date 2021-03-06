package com.example.pi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pi.Services.IAchatService;
import com.example.pi.entities.Achat;



@RestController
public class AchatController {
	@Autowired
	IAchatService achatService;
	
	//http://localhost:8080/SpringMVC/servlet/allAchat
	//@CrossOrigin(origins ="*")
	@GetMapping("/allAchat")
	@ResponseBody
	public List<Achat> getUsers(){
		List<Achat> l=achatService.retrieveAllAchat();
		return l;
	}
	
	@PostMapping("/addAchat")
	@ResponseBody
	public Achat addAchat(@RequestBody Achat a) {
		return achatService.addAchat(a);
	}
	
	@PostMapping("/deleteAchat")
	@ResponseBody
	public void deleteAchat(@RequestBody Achat a) {
		achatService.deleteAchat(a);
	}
	
	@GetMapping("/getAchat/{id}")
	@ResponseBody
	public Optional<Achat> getUser(@PathVariable(value = "id")int id){
		Optional<Achat> a=achatService.retrieveAchat(id);
		return a;
	}
	
	@PostMapping("/updateAchat")
	@ResponseBody
	public Achat updateAchat(@RequestBody Achat a) {
		return achatService.updateAchat(a);
	}

	
	@GetMapping("/searchAchatT/{titre}")
	@ResponseBody
	public List<Achat> searchAchatT(@PathVariable(value = "titre") String titre){
		List<Achat> l=achatService.searchAchatT(titre);
		return l;
	}
	@GetMapping("/searchAchatC/{city}")
	@ResponseBody
	public List<Achat> searchAchatC(@PathVariable(value = "city") String city){
		List<Achat> l=achatService.searchAchatC(city);
		return l;
	}
	
	@GetMapping("/searchAchatTC/{titre}/{city}")
	@ResponseBody
	public List<Achat> searchAchatTC(@PathVariable(value = "titre") String titre, @PathVariable(value = "city") String city){
		List<Achat> l=achatService.searchAchatTC(titre,city);
		return l;
	}
	
	
		
}

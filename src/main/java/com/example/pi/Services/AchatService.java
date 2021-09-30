package com.example.pi.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pi.Repository.AchatRepository;
import com.example.pi.entities.Achat;



@Service
public class AchatService implements IAchatService {

	@Autowired
	AchatRepository ar;
	
	@Override
	public List<Achat> retrieveAllAchat() {
		List <Achat> al =(List<Achat>) ar.findAll();
		return al;
	}

	@Override
	public Achat addAchat(Achat a) {
		return (Achat) ar.save(a);
	}

	@Override
	public void deleteAchat(Achat a) {
		ar.deleteById(a.getId());
		
	}

	@Override
	public Achat updateAchat(Achat a) {
		Achat al = (Achat) ar.save(a);
		return al;
	}

	@Override
	public Optional<Achat> retrieveAchat(int id) {
		Optional<Achat> a=ar.findById(id);
		return a;
	}
	@Override
	public List<Achat> searchAchatT(String titre){
		List <Achat> al =(List<Achat>) ar.searchAchatT(titre);
		return al;
	}
	@Override
	public List<Achat> searchAchatC(String city){
		List <Achat> al =(List<Achat>) ar.searchAchatC(city);
		return al;
	}
	@Override
	public List<Achat> searchAchatTC(String titre, String city){
		List <Achat> al =(List<Achat>) ar.searchAchatTC(titre,city);
		return al;
	}

}

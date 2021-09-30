package com.example.pi.Services;

import java.util.List;
import java.util.Optional;

import com.example.pi.entities.Achat;



public interface IAchatService {
	List<Achat> retrieveAllAchat();
	Achat addAchat(Achat a);
	void deleteAchat(Achat a);
	Achat updateAchat(Achat a);
	Optional<Achat> retrieveAchat(int id);
	List<Achat> searchAchatT(String titre);
	List<Achat> searchAchatC(String city);
	List<Achat> searchAchatTC(String titre, String city);
}

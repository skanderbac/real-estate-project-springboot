package com.example.pi.Services;

import java.util.List;
import java.util.Optional;

import com.example.pi.entities.Achat;



public interface IAchatService {
	List<Achat> retrieveAllAchat();
	Achat addAchat(Achat a);
	void deleteAchat(Achat a);
	List<Achat> updateAchat(Achat a);
	Optional<Achat> retrieveAchat(int id);
}

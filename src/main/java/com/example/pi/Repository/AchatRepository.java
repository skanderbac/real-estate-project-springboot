package com.example.pi.Repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.pi.entities.Achat;




@Repository
public interface AchatRepository extends CrudRepository<Achat,Integer> {

	@Query("SELECT a FROM Achat a WHERE a.titre like %:titre%")
	List<Achat> searchAchatT(@Param("titre") String titre);
	@Query("SELECT a FROM Achat a WHERE a.city=:city")
	List<Achat> searchAchatC(@Param("city") String city);
	@Query("SELECT a FROM Achat a WHERE a.city=:city or a.titre like %:titre%")
	List<Achat> searchAchatTC(@Param("titre") String titre, @Param("city") String city);
}

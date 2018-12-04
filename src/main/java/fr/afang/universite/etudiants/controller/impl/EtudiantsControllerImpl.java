package fr.afang.universite.etudiants.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.afang.universite.etudiants.business.IEtudiantsBusiness;
import fr.afang.universite.etudiants.controller.IEtudiantsController;
import fr.afang.universite.etudiants.domain.Etudiants;

@RestController
public class EtudiantsControllerImpl implements IEtudiantsController {

	@Autowired
	private IEtudiantsBusiness etudiantsBusiness;
	private static Logger logger = LoggerFactory.getLogger(EtudiantsControllerImpl.class);

	@Override
	@GetMapping("/etudiants")
	public List<Etudiants> getEtudiant() {
		List<Etudiants> liste = etudiantsBusiness.getListeEtudiants();
		return liste;

	}

	@Override
	@GetMapping("/etudiants/{id}")
	public Etudiants getEtudiantById(@PathVariable Integer id) {
		Etudiants et = etudiantsBusiness.getEtudiantsById(id);
		return et;

	}

	@Override
	@PostMapping("/etudiants")
	public Etudiants saveEtudiant(@RequestBody Etudiants etudiant) {
		return etudiantsBusiness.saveEtudiants(etudiant);
	}

	@Override
	@PutMapping("/etudiants/{id}")
	public Etudiants updateEtudiant(@RequestBody Etudiants etudiant, @PathVariable Integer id) {
		etudiant.setId(id);
		return etudiantsBusiness.saveEtudiants(etudiant);
	}

	@Override
	@DeleteMapping("/etudiants/{id}")
	public void deleteEtudiant(@PathVariable Integer id) {
		etudiantsBusiness.supprimerEtudiant(id);
	}

}
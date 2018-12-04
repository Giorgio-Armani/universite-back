package fr.afang.universite.matiere.controller.impl;

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

import fr.afang.universite.matiere.business.IMatiereBusiness;
import fr.afang.universite.matiere.controller.IMatiereController;
import fr.afang.universite.matiere.domain.Matiere;

@RestController
public class MatiereControllerImpl implements IMatiereController {

	@Autowired
	private IMatiereBusiness matiereBusiness;
	private static Logger logger = LoggerFactory.getLogger(MatiereControllerImpl.class);

	@Override
	@GetMapping("/matieres")
	public List<Matiere> getMatiere() {
		List<Matiere> liste = matiereBusiness.getListeMatiere();
		return liste;

	}

	@Override
	@GetMapping("/matieres/{id}")
	public Matiere getMatiereById(@PathVariable Integer id) {
		Matiere mat = matiereBusiness.getMatiereById(id);
		return mat;

	}

	@Override
	@PostMapping("/matieres")
	public Matiere saveMatiere(@RequestBody Matiere matiere) {
		return matiereBusiness.saveMatiere(matiere);
	}

	@Override
	@PutMapping("/matieres/{id}")
	public Matiere updateMatiere(@RequestBody Matiere matiere, @PathVariable Integer id) {
		matiere.setID(id);
		return matiereBusiness.updateMatiere(matiere);
	}

	@Override
	@DeleteMapping("/matieres/{id}")
	public void deleteMatiere(@PathVariable Integer id) {
		matiereBusiness.supprimeMatiere(id);

	}

}

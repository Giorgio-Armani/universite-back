package fr.afang.universite.enseignant.controller.impl;

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

import fr.afang.universite.enseignant.business.IEnseignantBusiness;
import fr.afang.universite.enseignant.controller.IEnseignantController;
import fr.afang.universite.enseignant.domain.Enseignant;

@RestController
public class EnseignantControllerImpl<Enseignants> implements IEnseignantController {

	@Autowired
	private IEnseignantBusiness enseignantBusiness;
	private static Logger logger = LoggerFactory.getLogger(EnseignantControllerImpl.class);

	@Override
	@GetMapping(path = "/enseignants")
	public List<Enseignant> getEnseignant() {
		List<Enseignant> liste = enseignantBusiness.getListeEnseignants();
		return liste;

	}

	@Override
	@GetMapping(path = "/enseignants/{id}")
	public Enseignant getEnseignantById(@PathVariable Integer id) {
		Enseignant en = enseignantBusiness.getEnseignantById(id);
		return en;

	}

	@Override
	@PostMapping(path = "/enseignants")
	public Enseignant saveEnseignant(@RequestBody Enseignant enseignant) {
		return enseignantBusiness.saveEnseignant(enseignant);
	}

	@Override
	@PutMapping("/enseignants/{id}")
	public Enseignant updateEnseignant(@RequestBody Enseignant enseignant, @PathVariable Integer id) {
		enseignant.setId(id);
		return enseignantBusiness.updateEnseignant(enseignant);
	}

	@Override
	@DeleteMapping("/enseignants/{id}")
	public void deleteEnseignant(@PathVariable Integer id) {
		enseignantBusiness.supprimerEnseignant(id);
	}

}

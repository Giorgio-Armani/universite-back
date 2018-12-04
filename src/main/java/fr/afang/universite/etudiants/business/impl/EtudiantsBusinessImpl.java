package fr.afang.universite.etudiants.business.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afang.universite.etudiants.business.IEtudiantsBusiness;
import fr.afang.universite.etudiants.domain.Etudiants;
import fr.afang.universite.etudiants.repository.IEtudiantsRepository;

@Service
public class EtudiantsBusinessImpl implements IEtudiantsBusiness {

	@Autowired
	private IEtudiantsRepository etudiantsRepository;
	private static Logger logger = LoggerFactory.getLogger(EtudiantsBusinessImpl.class);

	@Override
	public List<Etudiants> getListeEtudiants() {
		List<Etudiants> liste = etudiantsRepository.findAll();
		return liste;
	}

	@Override
	public Etudiants getEtudiantsById(Integer id) {
		Etudiants etu = etudiantsRepository.getOne(id);
		return etu;
	}

	@Override
	public Etudiants saveEtudiants(Etudiants etudiant) {
		return etudiantsRepository.save(etudiant);

	}

	@Override
	public void supprimerEtudiant(Integer id) {
		etudiantsRepository.deleteById(id);

	}

	@Override
	public Etudiants updateEtudiants(Etudiants etudiant, Integer id) {
		etudiant.setId(id);
		return etudiantsRepository.save(etudiant);

	}

}

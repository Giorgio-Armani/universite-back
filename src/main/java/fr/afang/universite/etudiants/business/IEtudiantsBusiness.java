package fr.afang.universite.etudiants.business;

import java.util.List;

import fr.afang.universite.etudiants.domain.Etudiants;

public interface IEtudiantsBusiness {

	List<Etudiants> getListeEtudiants();

	public Etudiants getEtudiantsById(Integer id);

	public Etudiants saveEtudiants(Etudiants etudiant);

	public Etudiants updateEtudiants(Etudiants etudiant, Integer id);

	public void supprimerEtudiant(Integer id);

}

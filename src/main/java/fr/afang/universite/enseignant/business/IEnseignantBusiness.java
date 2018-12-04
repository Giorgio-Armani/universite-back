package fr.afang.universite.enseignant.business;

import java.util.List;

import fr.afang.universite.enseignant.domain.Enseignant;

public interface IEnseignantBusiness {

	public List<Enseignant> getListeEnseignants();

	public Enseignant getEnseignantById(Integer id);

	public Enseignant saveEnseignant(Enseignant enseignant);

	public void supprimerEnseignant(Integer id);

	public Enseignant updateEnseignant(Enseignant enseignant);

}

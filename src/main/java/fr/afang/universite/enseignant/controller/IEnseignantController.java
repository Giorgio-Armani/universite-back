package fr.afang.universite.enseignant.controller;

import java.util.List;

import fr.afang.universite.enseignant.domain.Enseignant;

public interface IEnseignantController<Enseignants> {

	public List<Enseignant> getEnseignant();

	public Enseignant getEnseignantById(Integer id);

	public Enseignant saveEnseignant(Enseignant enseignant);

	public Enseignant updateEnseignant(Enseignant enseignant, Integer id);

	public void deleteEnseignant(Integer id);

}

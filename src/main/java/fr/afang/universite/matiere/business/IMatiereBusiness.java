package fr.afang.universite.matiere.business;

import java.util.List;

import fr.afang.universite.matiere.domain.Matiere;

public interface IMatiereBusiness {

	List<Matiere> getListeMatiere();

	public Matiere getMatiereById(Integer id);

	public Matiere saveMatiere(Matiere matiere);

	public Matiere updateMatiere(Matiere matiere);

	public void supprimeMatiere(Integer id);

}

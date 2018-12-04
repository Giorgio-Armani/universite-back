package fr.afang.universite.matiere.controller;

import java.util.List;

import fr.afang.universite.matiere.domain.Matiere;

public interface IMatiereController {

	public List<Matiere> getMatiere();

	public Matiere getMatiereById(Integer id);

	public void deleteMatiere(Integer id);

	public Matiere updateMatiere(Matiere matiere, Integer id);

	public Matiere saveMatiere(Matiere matiere);

}
